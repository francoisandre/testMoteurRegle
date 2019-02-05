package fr.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.gouv.education.sirhen.ct.moteurregles.commun.IFait;
import fr.gouv.education.sirhen.ct.moteurregles.commun.IRegle;
import fr.gouv.education.sirhen.ct.moteurregles.commun.impl.Resultat;
import fr.gouv.education.sirhen.ct.moteurregles.service.IMoteurReglesService;
import fr.gouv.education.sirhen.gin.congesabsences.transverse.fait.AgentFait;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
public class TestBasic {

	@Autowired
	IMoteurReglesService moteurRegles;

	@Test
	public void test() {
		Set < IFait > faits = new HashSet <>();

		AgentFait agent = new AgentFait();
		agent.setStatut("TITU1");
		agent.setPositionCouranteEnActivite(true);

		faits.add(agent);

		Resultat resultat = moteurRegles.executerRegles(faits, "ASF_EVT_demande_absence_service");
		List < IRegle > regles = resultat.getRegles();
		Assert.assertEquals(3, regles.size());
		for (IRegle iRegle : regles) {
			if (iRegle.getCode().compareTo("ASF_C_003") == 0) {
				Assert.assertTrue(iRegle.getVerifiee());
			} else {
				Assert.assertFalse(iRegle.getVerifiee());
			}
		}
		Assert.assertFalse(resultat.isVerifiee());

	}

}
