package fr.gouv.education.sirhen.ct.commun.transverse;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Classe utilitaire pour les dates.
 *
 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils}
 */
@Deprecated
public final class DateUtils {

	/**
	 * Pas de constructeur public pour cette classe.
	 */
	private DateUtils() {
		super();
	}

	/**
	 * Format pour la base de données yyyy-MM-dd hh:mm:ss.SSSSSS.
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#FORMAT_DATE_BASE_DE_DONNEES_TIMESTAMP}
	 */
	@Deprecated
	public static final String FORMAT_DATE_BASE_DE_DONNEES_TIMESTAMP = "yyyy-MM-dd HH:mm:ss.SSSSSS";

	/**
	 * Format pour tout les traitement yyyy-MM-dd HH:mm:ss.
	 *
	 * @deprecated n'est plus utilisé par racvision
	 */
	@Deprecated
	public static final String FORMAT_ISO_DATE_RACVISION = "yyyy-MM-dd HH:mm:ss";

	/**
	 * Format pour l'affichage uniquement dd/MM/yyyy.
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#FORMAT_AFFICHAGE_DATE}
	 */
	@Deprecated
	public static final String FORMAT_AFFICHAGE_DATE = "dd/MM/yyyy";

	/**
	 * Convertie la date passe en parametre avec un format.
	 *
	 * @param cal
	 *            la date
	 * @param dt
	 *            le format
	 *
	 * @return String
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateFormate(Calendar,DateFormat)}
	 */
	@Deprecated
	public static String getDateFormate(final Calendar cal, final DateFormat dt) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateFormate(cal, dt);
	}

	/**
	 * Convertie la date passe en parametre sous la forme yyyy-MM-dd hh:mm:ss.
	 *
	 * @param cal
	 *            la date
	 *
	 * @return AAAA-MM-JJ
	 *
	 * @deprecated n'est plus utilisé par racvision
	 */
	@Deprecated
	public static String getISODateRacvision(final Calendar cal) {
		Date date = cal.getTime();
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateFormat(FORMAT_ISO_DATE_RACVISION).format(date);
	}

	/**
	 * Convertit la date <code>cal</code> sous la forme {@link #FORMAT_ISO_DATE}.
	 *
	 * @param cal
	 *            le calendar à convertir
	 * @return la chaine au format {@link #FORMAT_ISO_DATE}, <code>null</code> sinon
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getISODate(Calendar)}
	 */
	@Deprecated
	public static String getISODate(final Calendar cal) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getISODate(cal);
	}

	/**
	 * <B>Uniquement pour l'affichage</B> Convertie la date passe en parametre sous la forme JJ/MM/AAAA.
	 *
	 * @param cal
	 *            la date à convertir au format JJ/MM/AAAA
	 * @return JJ/MM/AAAA
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getJJMMAAAA(Calendar)}
	 */
	@Deprecated
	public static String getJJMMAAAAAffichage(final Calendar cal) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getJJMMAAAA(cal);
	}

	/**
	 * Retourne une chaine sous la forme {@link #FORMAT_DATE_BASE_DE_DONNEES} représentant le <code>calendar</code>.
	 *
	 * @param calendar
	 *            le calendar à convertir
	 * @return la chaine sous la forme {@link #FORMAT_DATE_BASE_DE_DONNEES} représentant le <code>calendar</code>
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateyyyyMMddHHmmss(Calendar)}
	 */
	@Deprecated
	public static String getDateyyyyMMddHHmmss(final Calendar calendar) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateyyyyMMddHHmmss(calendar);
	}

	/**
	 * <B>Uniquement pour l'affichage</B> Convertie une chaine JJ/MM/AAAA en la date.
	 *
	 * @param jjmmaaaa
	 *            la date au format JJ/MM/AAAA à convertir en <code>Calendar</code>
	 * @return Calendar
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getCalendarJJMMAAAA(String)}
	 */
	@Deprecated
	public static Calendar getCalendarAffichage(final String jjmmaaaa) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getCalendarJJMMAAAA(jjmmaaaa);
	}

	/**
	 * Convertit la date au format yyyy-MM-dd HH:mm:ss.SSSSSS.
	 *
	 * @param calendar
	 *            la date à convertir sous le format yyyy-MM-dd HH:mm:ss.SSSSSS
	 * @return la date au format yyyy-MM-dd HH:mm:ss.SSSSSS
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateAsTimeStamp(Calendar)}
	 */
	@Deprecated
	public static String getDateAsTimeStamp(final Calendar calendar) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateAsTimeStamp(calendar);
	}

	/**
	 * Retourne l'année en cours <b>à la Time Zone du Système</b>.
	 *
	 * @return l'année au format AAAA
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getAAAA()}
	 */
	@Deprecated
	public static String getAAAA() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getAAAA();
	}

	/**
	 * Retourne l'année en cours <b>à la Time Zone du Système</b>.
	 *
	 * @return l'année au format AAAA
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getAnneeCourante()}
	 */
	@Deprecated
	public static int getAnneeCourante() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getAnneeCourante();
	}

	/**
	 * Retourne la date du jour sous la forme AAAA-MM-JJ <b>à la Time Zone du Système</b>.
	 *
	 * @return la date du jour au format AAAA-MM-JJ
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getAAAAMMJJ()}
	 */
	@Deprecated
	public static String getAAAAMMJJ() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getAAAAMMJJ();
	}

	/**
	 * Convertit la date <code>cal</code> sous la forme {@link #FORMAT_DATE}.
	 *
	 * @param cal
	 *            le calendar à convertir
	 * @return la chaine au format {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#FORMAT_DATE}, <code>null</code> sinon
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getAAAAMMJJ(Calendar)}
	 */
	@Deprecated
	public static String getAAAAMMJJ(final Calendar cal) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getAAAAMMJJ(cal);
	}

	/**
	 * Convertie une chaine AAAAMMJJ en la date.
	 *
	 * @param aaaammjj
	 *            chaine de caractères.
	 * @return Calendar
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getCalendarISO(String)}
	 */
	@Deprecated
	public static Calendar getCalendarISO(final String aaaammjj) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getCalendarISO(aaaammjj);
	}

	/**
	 * Convertit la chaine <code>yyyyMMddHHmmss</code> au format {@link #FORMAT_DATE_BASE_DE_DONNEES} en la date correspondante.
	 *
	 * @param yyyyMMddHHmmss
	 *            la date au format {@link #FORMAT_DATE_BASE_DE_DONNEES}
	 * @return l'objet <code>java.util.Calendar</code> correspondant à la chaine <code>yyyyMMddHHmmss</code>, <code>null</code>
	 *         sinon
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getCalendaryyyyMMddHHmmss(String)}
	 */
	@Deprecated
	public static Calendar getCalendaryyyyMMddHHmmss(final String yyyyMMddHHmmss) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getCalendaryyyyMMddHHmmss(yyyyMMddHHmmss);
	}

	/**
	 * <B>Uniquement pour l'affichage</B> Convertie la date passe en parametre sous la forme JJ/MM/AAAA.
	 *
	 * @param cal
	 *            la date à convertir au format JJ/MM/AAAA
	 * @return JJ/MM/AAAA
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getJJMMAAAA(Calendar)}
	 */
	@Deprecated
	public static String getJJMMAAAA(final Calendar cal) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getJJMMAAAA(cal);
	}

	/**
	 * <B>Uniquement pour l'affichage</B> Convertie une chaine JJ/MM/AAAA en la date.
	 *
	 * @param jjmmaaaa
	 *            la date au format JJ/MM/AAAA à convertir en <code>Calendar</code>
	 * @return Calendar
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getCalendarJJMMAAAA(String)}
	 */
	@Deprecated
	public static Calendar getCalendar(final String jjmmaaaa) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getCalendarJJMMAAAA(jjmmaaaa);
	}

	/**
	 * La date au premier Janvier de l'année en cours à 00:00 (reset de l'heure).
	 *
	 * @return le <code>Calendar</code> qui représente le 1er Janvier de l'année en cours
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#get1erJanvier()}
	 */
	@Deprecated
	public static Calendar get1erJanvier() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.get1erJanvier();
	}

	/**
	 * La date au premier Janvier de l'année passée/futur à 00:00 (reset de l'heure).
	 *
	 * @param annee
	 *            l'année auquelle il faut calculer la date du 1er janvier
	 * @return le <code>Calendar</code> qui représente le 1er Janvier de l'année <code>annee</code>
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#get1erJanvier(int)}
	 */
	@Deprecated
	public static Calendar get1erJanvier(final int annee) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.get1erJanvier(annee);
	}

	/**
	 * La date au 31 Decembre de l'année en cours.
	 *
	 * @return Calendar
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#get31Decembre()}
	 */
	@Deprecated
	public static Calendar get31Decembre() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.get31Decembre();
	}

	/**
	 * La date au 31 Decembre de l'année passée/futur.
	 *
	 * @param annee
	 *            l'année auquelle il faut calculer la date du 31 décembre
	 * @return le <code>Calendar</code> qui représente le 31 décembre de l'année <code>annee</code>
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#get31Decembre(int)}
	 */
	@Deprecated
	public static Calendar get31Decembre(final int annee) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.get31Decembre(annee);
	}

	/**
	 * Mise à 00:00 de la date passé (reset de l'heure).
	 *
	 * @param date
	 *            Calendar à mettre à 00:00
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#miseAZeroHeure(Calendar)}
	 */
	@Deprecated
	public static void miseAZeroHeure(final Calendar date) {
		fr.gouv.education.sirhen.ct.socle.utils.DateUtils.miseAZeroHeure(date);
	}

	/**
	 * Wrapper after pour les calendar avec une précision JOUR.
	 *
	 * @param c1
	 *            Calendar 1
	 * @param c2
	 *            Calendar 2
	 * @return idem que pour la methode after
	 * @see java.util.Calendar#after(Object)
	 * @since 1.0.7
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#afterPrecisionJour(Calendar, Calendar)}
	 */
	@Deprecated
	public static boolean afterPrecisionJour(final Calendar c1, final Calendar c2) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.afterPrecisionJour(c1, c2);
	}

	/**
	 * Wrapper before pour les calendar avec une précision JOUR.
	 *
	 * @param c1
	 *            Calendar 1
	 * @param c2
	 *            Calendar 2
	 * @return idem que pour la methode after
	 * @see java.util.Calendar#before(Object)
	 * @since 1.0.7
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#beforePrecisionJour(Calendar, Calendar)}
	 */
	@Deprecated
	public static boolean beforePrecisionJour(final Calendar c1, final Calendar c2) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.beforePrecisionJour(c1, c2);
	}

	/**
	 * Wrapper compareTo pour les calendar avec une précision JOUR.
	 *
	 * @param c1
	 *            Calendar 1
	 * @param c2
	 *            Calendar 2
	 * @return idem que pour la methode after
	 * @see java.util.Calendar#compareTo(Object)
	 * @since 1.0.7
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#compareToPrecisionJour(Calendar, Calendar)}
	 */
	@Deprecated
	public static int compareToPrecisionJour(final Calendar c1, final Calendar c2) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.compareToPrecisionJour(c1, c2);
	}

	/**
	 * Retourne une instance de l'objet <code>java.util.Calendar</code> vide (0000-00-00T00:00:00).
	 *
	 * @return une instance de l'objet <code>java.util.Calendar</code> vide
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDate()}
	 */
	@Deprecated
	public static Calendar getDate() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDate();
	}

	/**
	 * Retourne la date courante <b>à la Time Zone du Système</b>.
	 *
	 *
	 * @return la date courante <b>à la Time Zone du Système</b>
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateCourante()}
	 */
	@Deprecated
	public static Calendar getDateCourante() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateCourante();
	}

	/**
	 * @return La date courante en Millisecondes.
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateCouranteEnMillisecondes()}
	 */
	@Deprecated
	public static long getDateCouranteEnMillis() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateCouranteEnMillisecondes();
	}

	/**
	 * Retourne une chaine au format {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#FORMAT_DATE_BAS_PAGE} représentant
	 * la date courante.
	 *
	 * @return la date courante au format {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#FORMAT_DATE_BAS_PAGE}
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDateBasDePage()}
	 */
	@Deprecated
	public static String getDateBasDePage() {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDateBasDePage();
	}

	/**
	 * Calcule le nombre de jours calendaires entre deux dates Le decompte est fait incluant les dates de debuyt et de fin.
	 *
	 * @param debut
	 *            la date de début
	 * @param fin
	 *            la date de fin
	 * @return le nombre de jours calandaires calcules.
	 * @deprecated Use {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeJoursCalendairePleins(Calendar,Calendar)}
	 *             instead
	 */
	@Deprecated
	public static int getDureeJoursCalendairePleins(final Calendar debut, final Calendar fin) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeJoursCalendairePleins(debut, fin);
	}

	/**
	 * Calcule le nombre de jours calendaires entre deux dates.<br/>
	 * Le decompte est fait incluant les dates de debut et de fin. Est pris en compte egalement si les dates de debut et de fin
	 * sont entieres ou à moitié selon le flag AM/PM du Calendrier les representant. Si la date de debut est flagée comme AM, elle
	 * represente un journée, si elle est flagés PM, elle represente une demi-journée. Idem mais dans l'autre sens pour la date de
	 * fin : AM = une demi-journée, PM = 1 journée.
	 *
	 * @param debut
	 *            la date de début
	 * @param fin
	 *            la date de fin
	 * @return le nombre de jours calandaires calculés.
	 * @deprecated Use {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeJoursCalendaire(Calendar,Calendar)}
	 *             instead
	 */
	@Deprecated
	public static BigDecimal getDureeJoursCalendaire(final Calendar debut, final Calendar fin) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeJoursCalendaire(debut, fin);
	}

	/**
	 * Calcule le nombre de jours calendaires (en float) entre deux dates.<br/>
	 * Le decompte est fait incluant les dates de debut et de fin. Est pris en compte egalement si les dates de debut et de fin
	 * sont entieres ou à moitié selon le flag AM/PM du Calendrier les representant. Si la date de debut est flagée comme AM, elle
	 * represente un journée, si elle est flagés PM, elle represente une demi-journée. Idem mais dans l'autre sens pour la date de
	 * fin : AM = une demi-journée, PM = 1 journée.
	 *
	 * @param debut
	 *            la date de début
	 * @param fin
	 *            la date de fin
	 * @return le nombre de jours calandaires calculés.
	 * @deprecated Use {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeJoursCalendaireEnFloat(Calendar,Calendar)}
	 *             instead
	 */
	@Deprecated
	public static float getDureeJoursCalendaireEnFloat(final Calendar debut, final Calendar fin) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeJoursCalendaireEnFloat(debut, fin);
	}

	/**
	 * Calcule le nombre de jour ouvrables entre deux dates, avec l'assumption qu'il y a 6 jours ouvrables par semaine. Le
	 * decompte est fait incluant les dates de debuyt et de fin. Est pris en compte egalement si les dates de debut et de fin sont
	 * entieres ou à moitié selon le flag AM/PM du Calendrier les representant. Si la date de debut est flagée comme AM, elle
	 * represente un journée, si elle est flagés PM, elle represente une demi-journée. Idem mais dans l'autre sens pour la date de
	 * fin : AM = une demi-journée, PM = 1 journée.
	 *
	 * @param debut
	 *            la date de début
	 * @param fin
	 *            la date de fin
	 * @return le nombre de jours ouvrables calcules.
	 * @deprecated Use {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeJoursOuvrables(Calendar,Calendar)} instead
	 */
	@Deprecated
	public static BigDecimal getDureeJoursOuvrables(final Calendar debut, final Calendar fin) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeJoursOuvrables(debut, fin);
	}

	/**
	 * Calcule le nombre de jour ouvre entre deux dates, avec l'assumption qu'il y a 5 jours ouvres par semaine. Le decompte est
	 * fait incluant les dates de debut et de fin. Est pris en compte egalement si les dates de debut et de fin sont entieres ou à
	 * moitié selon le flag AM/PM du Calendrier les representant. Si la date de debut est flagée comme AM, elle represente un
	 * journée, si elle est flagés PM, elle represente une demi-journée. Idem mais dans l'autre sens pour la date de fin : AM =
	 * une demi-journée, PM = 1 journée.
	 *
	 * @param debut
	 *            la date de debut
	 * @param fin
	 *            la date de fin
	 * @return le nombre de jours ouvres calcules.
	 * @deprecated Use {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeJoursOuvres(Calendar,Calendar)} instead
	 */
	@Deprecated
	public static BigDecimal getDureeJoursOuvres(final Calendar debut, final Calendar fin) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeJoursOuvres(debut, fin);
	}

	/**
	 * Calcule une duree entre deux dates incluses en trentièmes sans tenir compte des flag AM et PM.
	 *
	 * @param debut
	 *            date de debut
	 * @param fin
	 *            date de fin
	 * @return la duree calculée en trentiemes
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeTrentiemePlein(Calendar, Calendar)}
	 */
	@Deprecated
	public static Duration getDureeTrentiemePlein(final Calendar debut, final Calendar fin) {
		return new Duration(fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeTrentiemePlein(debut, fin));
	}

	/**
	 * Calcule une duree entre deux dates incluses en trentièmes ... Est pris en compte egalement si les dates de debut et de fin
	 * sont entieres ou à moitié selon le flag AM/PM du Calendrier les representant. Si la date de debut est flagée comme AM, elle
	 * represente un journée, si elle est flagés PM, elle represente une demi-journée. Idem mais dans l'autre sens pour la date de
	 * fin : AM = une demi-journée, PM = 1 journée.
	 *
	 * @param debut
	 *            date de debut
	 * @param fin
	 *            date de fin
	 * @return la duree calculée en trentiemes
	 *
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getDureeTrentieme(Calendar, Calendar)}
	 */
	@Deprecated
	public static Duration getDureeTrentieme(final Calendar debut, final Calendar fin) {
		return new Duration(fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getDureeTrentieme(debut, fin));
	}

	/**
	 * Calcule la liste des jours feriés entre deux dates incluses, qui sont ouvrable ( pas un Dimanche).
	 *
	 * @param debutPeriode
	 *            le debut de la periode des jours feriés.
	 * @param finPeriode
	 *            a fin de la periode des jours feriés.
	 * @return une liste de Calendriers.
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getJoursFeriesOuvrables(Calendar,Calendar)}
	 */
	@Deprecated
	public static List < Calendar > getJoursFeriesOuvrables(final Calendar debutPeriode, final Calendar finPeriode) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getJoursFeriesOuvrables(debutPeriode, finPeriode);
	}

	/**
	 * Calcule la liste des jours feriés entre deux dates incluses, qui sont ouvrés ( pas un Samedi, ni Dimanche).
	 *
	 * @param debutPeriode
	 *            le debut de la periode des jours feriés.
	 * @param finPeriode
	 *            a fin de la periode des jours feriés.
	 * @return une liste de Calendriers.
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getJoursFeriesOuvres(Calendar,Calendar)}
	 */
	@Deprecated
	public static List < Calendar > getJoursFeriesOuvres(final Calendar debutPeriode, final Calendar finPeriode) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getJoursFeriesOuvres(debutPeriode, finPeriode);
	}

	/**
	 * Calcule la liste des jours feries compris entre deux dates incluses. Les jours feriés pris en compte sont: jour de l'an,
	 * paques, fete du travail, 8 mai, ascension, pentecote, fete nationale, assomption, toussaint, armistice, noel.
	 *
	 * @param debutPeriode
	 *            le debut de la periode des jours feriés.
	 * @param finPeriode
	 *            la fin de la periode des jours feriés.
	 * @return une liste de Calendriers.
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getJoursFeries(Calendar,Calendar)}
	 */
	@Deprecated
	public static List < Calendar > getJoursFeries(final Calendar debutPeriode, final Calendar finPeriode) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getJoursFeries(debutPeriode, finPeriode);
	}

	/**
	 * Calcule la date de paques pour une année donnée.
	 *
	 * Lilius et Clavius en 16xx. (Knuth vol1, p.155)
	 *
	 * @param annee
	 *            l'anne pour laquelle paques est a calculer.
	 * @return un Calendrier representant la date de paques.
	 * @deprecated Utiliser {@link fr.gouv.education.sirhen.ct.socle.utils.DateUtils#getPaques(int)}
	 */
	@Deprecated
	public static Calendar getPaques(final int annee) {
		return fr.gouv.education.sirhen.ct.socle.utils.DateUtils.getPaques(annee);
	}

}
