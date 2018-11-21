package fr.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import fr.gouv.education.sirhen.ct.moteurregles.service.IMoteurReglesService;
import fr.gouv.education.sirhen.ct.moteurregles.service.impl.DingoMoteur;
import fr.gouv.education.sirhen.ct.socle.configuration.ConfigurationComposantTechnique;

@Configuration
public class TestConfiguration {

	@Autowired
	private ApplicationContext appContext;

	@Bean
	public IMoteurReglesService getMoteurRegles() {
		IMoteurReglesService resultat = new DingoMoteur(appContext, getConfigurationComposantTechnique());
		return resultat;
	}

	private Resource configFile = new ClassPathResource("config.properties");

	@Bean
	public ConfigurationComposantTechnique getConfigurationComposantTechnique() {
		ConfigurationComposantTechnique resultat = new ConfigurationComposantTechnique();
		resultat.setEmplacement(configFile);
		resultat.setId("42");
		return resultat;
	}

}
