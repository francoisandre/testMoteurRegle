package fr.gouv.education.sirhen.ct.commun.transverse;

import java.math.BigDecimal;

/**
 * Classe utilitaire pour representer une durée en ans, mois, jour. La classe Calendar ne pouvant poas etre utilisée pour ce
 * besoin car les champs sont renomalisés si l'on accede à l'un deux par in get( nom champ).
 *
 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.transverse.Duration}
 */
@Deprecated
public class Duration extends fr.gouv.education.sirhen.ct.socle.transverse.Duration {

	/**
	 * Crée une Duration avec les valeurs indiquées.
	 *
	 * @param ans
	 *            les années
	 * @param mois
	 *            les mois
	 * @param jour
	 *            les jours
	 */
	public Duration(final int ans, final int mois, final BigDecimal jour) {
		super(ans, mois, jour);
	}

	/**
	 * Crée une Duration ct-commun a partir d'une ct-socle.
	 *
	 * @param duration
	 *            duration t-socle
	 */
	public Duration(final fr.gouv.education.sirhen.ct.socle.transverse.Duration duration) {
		super(duration.getAns(), duration.getMois(), duration.getJour());
	}
}
