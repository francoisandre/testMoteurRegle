package fr.gouv.education.sirhen.ct.moteurregles.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.mockito.internal.util.io.IOUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import fr.gouv.education.sirhen.ct.moteurregles.commun.IRegle;
import fr.gouv.education.sirhen.ct.moteurregles.commun.impl.Regle;
import fr.gouv.education.sirhen.ct.moteurregles.transverse.Constantes;
import fr.gouv.education.sirhen.ct.moteurregles.transverse.util.MoteurReglesUtil;
import fr.gouv.education.sirhen.ct.socle.configuration.ConfigurationComposantTechnique;

public class DingoMoteur extends MoteurReglesServiceImpl {

	public DingoMoteur(final ApplicationContext applicationContext, final ConfigurationComposantTechnique configuration) {
		super(applicationContext, configuration);
	}

	@Override
	protected void initialiseBaseConnaissance() {
		this.kContainer = getKieContainer();
	}

	public KieContainer getKieContainer() {

		KieServices kieServices = KieServices.Factory.get();
		final KieRepository kieRepository = kieServices.getRepository();
		kieRepository.addKieModule(new KieModule() {
			public ReleaseId getReleaseId() {
				return kieRepository.getDefaultReleaseId();
			}
		});

		KieBuilder kb;
		try {
			kb = kieServices.newKieBuilder(getKieFileSystem(kieServices));
		} catch (IOException e) {
			return null;
		}
		kb.buildAll();

		KieModule kieModule = kb.getKieModule();
		KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());

		return kContainer;
	}

	private KieFileSystem getKieFileSystem(final KieServices kieServices) throws IOException {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		Resource fichierRegles = new ClassPathResource(kjarfile);
		kieFileSystem.write(ResourceFactory.newInputStreamResource(fichierRegles.getInputStream()).setTargetPath("fake.drl"));
		return kieFileSystem;
	}

	@Override
	protected List < IRegle > getListeRegles(final String typeEvenement) {
		if (CollectionUtils.isEmpty(listReglesFromXml)) {
			try {

				listReglesFromXml = new ArrayList < IRegle >();
				for (String fileName : xmlruleslist.split(",")) {
					ClassPathResource resource = new ClassPathResource(fileName);
					List < IRegle > listRegles = MoteurReglesUtil.lireFichierRegles(resource.getInputStream());
					listReglesFromXml.addAll(listRegles);
					IOUtil.closeQuietly(resource.getInputStream());
				}
				// READ FROM JAR

			} catch (IOException e) {
				factory.throwTechnicalException(Constantes.ERR_ACCES_XML_REGLES_BRMS, e);
			}
		}

		List < IRegle > reglesList = new ArrayList < IRegle >();
		if (typeEvenement == null) {
			reglesList = listReglesFromXml;
		} else {
			reglesList = (List < IRegle >) CollectionUtils.select(listReglesFromXml, new Predicate() {
				@Override
				public boolean evaluate(final Object object) {
					return ((Regle) object).isAppartientEvenement(typeEvenement);
				}
			});
		}
		return MoteurReglesUtil.clonerRegles(reglesList);
	}

}
