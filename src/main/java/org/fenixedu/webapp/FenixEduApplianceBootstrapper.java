/**
 * Copyright © 2002 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Core.
 *
 * FenixEdu Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Core.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.fenixedu.webapp;

import java.util.List;
import java.util.Locale;

import net.sourceforge.fenixedu.domain.person.RoleType;
import net.sourceforge.fenixedu.presentationTier.Action.BolonhaManager.BolonhaManagerApplication;
import net.sourceforge.fenixedu.presentationTier.Action.BolonhaManager.BolonhaManagerApplication.CompetenceCourseManagementApp;
import net.sourceforge.fenixedu.presentationTier.Action.BolonhaManager.BolonhaManagerApplication.CurricularPlansManagementApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminCalendarsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminCandidaciesApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminContributorsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminDCPApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminDocumentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminEquivalencesApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminExecutionsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminExtraCurricularApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminInstitutionsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminListingsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminMarksheetApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminOfficeApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminPaymentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminPhdApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminPricesApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminScholarshipsApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminServicesApp;
import net.sourceforge.fenixedu.presentationTier.Action.academicAdministration.AcademicAdministrationApplication.AcademicAdminStudentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.alumni.AlumniApplication.AlumniAcademicPathApp;
import net.sourceforge.fenixedu.presentationTier.Action.alumni.AlumniApplication.AlumniAcademicServicesApp;
import net.sourceforge.fenixedu.presentationTier.Action.alumni.AlumniApplication.AlumniFormationApp;
import net.sourceforge.fenixedu.presentationTier.Action.alumni.AlumniApplication.AlumniProfessionalInfoApp;
import net.sourceforge.fenixedu.presentationTier.Action.alumni.AlumniHomeDA;
import net.sourceforge.fenixedu.presentationTier.Action.candidate.CandidateApplication;
import net.sourceforge.fenixedu.presentationTier.Action.candidate.CandidateApplication.CandidateCandidaciesApp;
import net.sourceforge.fenixedu.presentationTier.Action.coordinator.CoordinatorApplication.CoordinatorManagementApp;
import net.sourceforge.fenixedu.presentationTier.Action.coordinator.CoordinatorApplication.CoordinatorPhdApp;
import net.sourceforge.fenixedu.presentationTier.Action.delegate.DelegateApplication.DelegateConsultApp;
import net.sourceforge.fenixedu.presentationTier.Action.delegate.DelegateApplication.DelegateMessagingApp;
import net.sourceforge.fenixedu.presentationTier.Action.delegate.DelegateApplication.DelegateParticipateApp;
import net.sourceforge.fenixedu.presentationTier.Action.delegate.ReadDelegateDegreeDispatchAction;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeCreditsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeExamsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeExpectationsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeGroupsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeListingsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeMessagingApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeStudentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeTeachersApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentAdmOffice.DepartmentAdmOfficeApp.DepartmentAdmOfficeViewApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp.DepartmentMemberAccompanimentApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp.DepartmentMemberDepartmentApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp.DepartmentMemberMessagingApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp.DepartmentMemberPresidentApp;
import net.sourceforge.fenixedu.presentationTier.Action.departmentMember.DepartmentMemberApp.DepartmentMemberTeacherApp;
import net.sourceforge.fenixedu.presentationTier.Action.directiveCouncil.DirectiveCouncilApplication;
import net.sourceforge.fenixedu.presentationTier.Action.directiveCouncil.DirectiveCouncilApplication.DirectiveCouncilCareerWorkshops;
import net.sourceforge.fenixedu.presentationTier.Action.directiveCouncil.DirectiveCouncilApplication.DirectiveCouncilControlApp;
import net.sourceforge.fenixedu.presentationTier.Action.directiveCouncil.DirectiveCouncilApplication.DirectiveCouncilExternalSupervision;
import net.sourceforge.fenixedu.presentationTier.Action.externalSupervision.ExternalSupervisionApplication;
import net.sourceforge.fenixedu.presentationTier.Action.externalSupervision.ExternalSupervisionApplication.ExternalSupervisionConsultApp;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication.GepAlumniApp;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication.GepInquiriesApp;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication.GepPortalApp;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication.GepRAIDESApp;
import net.sourceforge.fenixedu.presentationTier.Action.gep.GepApplication.GepRegisteredDegreeCandidaciesApp;
import net.sourceforge.fenixedu.presentationTier.Action.internationalRelatOffice.InternationalRelationsApplication;
import net.sourceforge.fenixedu.presentationTier.Action.internationalRelatOffice.InternationalRelationsApplication.InternRelationsConsultApp;
import net.sourceforge.fenixedu.presentationTier.Action.internationalRelatOffice.InternationalRelationsApplication.InternRelationsInternshipApp;
import net.sourceforge.fenixedu.presentationTier.Action.internationalRelatOffice.InternationalRelationsApplication.InternRelationsMobilityApp;
import net.sourceforge.fenixedu.presentationTier.Action.library.LibraryApplication;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerBolonhaTransitionApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerExecutionsApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerMessagesAndNoticesApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerOrganizationalStructureApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerPaymentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerPeopleApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerPersonManagementApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerStudentsApp;
import net.sourceforge.fenixedu.presentationTier.Action.manager.ManagerApplications.ManagerSystemManagementApp;
import net.sourceforge.fenixedu.presentationTier.Action.masterDegree.administrativeOffice.MasterDegreeOfficeApplication.MasterDegreeCandidatesApp;
import net.sourceforge.fenixedu.presentationTier.Action.masterDegree.administrativeOffice.MasterDegreeOfficeApplication.MasterDegreeDfaApp;
import net.sourceforge.fenixedu.presentationTier.Action.messaging.MessagingApplication.MessagingAnnouncementsApp;
import net.sourceforge.fenixedu.presentationTier.Action.messaging.MessagingApplication.MessagingEmailsApp;
import net.sourceforge.fenixedu.presentationTier.Action.messaging.MessagingApplication.MessagingFilesApp;
import net.sourceforge.fenixedu.presentationTier.Action.messaging.MessagingApplication.MessagingSearchApp;
import net.sourceforge.fenixedu.presentationTier.Action.nape.NapeApplication;
import net.sourceforge.fenixedu.presentationTier.Action.nape.NapeApplication.NapeCandidaciesApp;
import net.sourceforge.fenixedu.presentationTier.Action.nape.NapeApplication.NapeRegisteredCandidaciesApp;
import net.sourceforge.fenixedu.presentationTier.Action.operator.OperatorApplication;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp.PedagogicalBolonhaProcessApp;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp.PedagogicalCommunicationApp;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp.PedagogicalControlApp;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp.PedagogicalDelegatesApp;
import net.sourceforge.fenixedu.presentationTier.Action.pedagogicalCouncil.PedagogicalCouncilApp.TutorshipApp;
import net.sourceforge.fenixedu.presentationTier.Action.person.PersonApplication.ExternalApplicationsApp;
import net.sourceforge.fenixedu.presentationTier.Action.person.PersonApplication.HomepageApp;
import net.sourceforge.fenixedu.presentationTier.Action.person.PersonApplication.PersonalAreaApp;
import net.sourceforge.fenixedu.presentationTier.Action.personnelSection.PersonnelSectionApplication;
import net.sourceforge.fenixedu.presentationTier.Action.publicRelationsOffice.PublicRelationsApplication;
import net.sourceforge.fenixedu.presentationTier.Action.publicRelationsOffice.PublicRelationsApplication.PublicRelationsAlumniApp;
import net.sourceforge.fenixedu.presentationTier.Action.rectorate.batches.RectorateApplication;
import net.sourceforge.fenixedu.presentationTier.Action.research.ResearcherApplication;
import net.sourceforge.fenixedu.presentationTier.Action.residenceManagement.ResidenceManagerApplication;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMCurriculumHistoricApp;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMEvaluationsApp;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMExecutionCoursesApp;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMFirstYearShiftsApp;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMPeriodsApp;
import net.sourceforge.fenixedu.presentationTier.Action.resourceAllocationManager.RAMApplication.RAMSchedulesApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificApplicationsApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificBolonhaProcessApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificCommunicationApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificCreditsApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificDisserationsApp;
import net.sourceforge.fenixedu.presentationTier.Action.scientificCouncil.ScientificCouncilApplication.ScientificTeachersApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.ShowStudentPortalDA;
import net.sourceforge.fenixedu.presentationTier.Action.student.StudentApplication.StudentEnrollApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.StudentApplication.StudentParticipateApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.StudentApplication.StudentSeniorsApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.StudentApplication.StudentSubmitApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.StudentApplication.StudentViewApp;
import net.sourceforge.fenixedu.presentationTier.Action.student.administrativeOfficeServices.StudentAcademicOfficeServices;
import net.sourceforge.fenixedu.presentationTier.Action.teacher.TeacherApplication.TeacherFinalWorkApp;
import net.sourceforge.fenixedu.presentationTier.Action.teacher.TeacherApplication.TeacherMobilityApp;
import net.sourceforge.fenixedu.presentationTier.Action.teacher.TeacherApplication.TeacherPhdApp;
import net.sourceforge.fenixedu.presentationTier.Action.teacher.TeacherApplication.TeacherTeachingApp;
import net.sourceforge.fenixedu.presentationTier.Action.teacher.TeacherApplication.TeacherTutorApp;
import net.sourceforge.fenixedu.presentationTier.Action.vigilancy.examCoordination.ExamCoordinationApplication;
import net.sourceforge.fenixedu.presentationTier.Action.webSiteManager.ListSitesAction;
import net.sourceforge.fenixedu.util.BundleUtil;

import org.fenixedu.bennu.core.bootstrap.BootstrapError;
import org.fenixedu.bennu.core.bootstrap.annotations.Bootstrap;
import org.fenixedu.bennu.core.bootstrap.annotations.Bootstrapper;
import org.fenixedu.bennu.portal.domain.MenuContainer;
import org.fenixedu.bennu.portal.domain.MenuFunctionality;
import org.fenixedu.bennu.portal.domain.MenuItem;
import org.fenixedu.bennu.portal.domain.PortalConfiguration;
import org.fenixedu.bennu.portal.model.Application;
import org.fenixedu.bennu.portal.model.ApplicationRegistry;
import org.fenixedu.commons.i18n.LocalizedString;
import org.fenixedu.idcards.ui.IdCardsApp;
import org.fenixedu.spaces.ui.SpacesController;

import pt.utl.ist.codeGenerator.database.FenixBootstrapper;

import com.google.common.collect.Lists;

@Bootstrapper(sections = {}, name = "bootstrapper.name", bundle = BundleUtil.APPLICATION_BUNDLE, after = FenixBootstrapper.class)
public class FenixEduApplianceBootstrapper {

    final static Locale PT = new Locale("pt");
    final static Locale EN = new Locale("en");

    @Bootstrap
    public static List<BootstrapError> boostrap() {

        installMenus();
        return Lists.newArrayList();
    }

    private static void installMenus() {

        MenuContainer root = PortalConfiguration.getInstance().getMenu();

        PortalConfiguration.getInstance().setTheme("ashes");
        for (MenuItem item : root.getOrderedChild()) {
            if (item.isMenuContainer()) {
                item.delete();
            }
        }

        {
            MenuContainer messaging = make(root, RoleType.MESSAGING, "Comunicação", "Messaging");
            install(messaging, MessagingAnnouncementsApp.class, MessagingEmailsApp.class, MessagingFilesApp.class,
                    MessagingSearchApp.class);
            findFunctionalityWithPath(messaging, 0, "messaging", "news").setOrd(0);
        }

        {
            MenuContainer student = install(root, ShowStudentPortalDA.class);
            install(student, StudentViewApp.class, StudentParticipateApp.class, StudentSubmitApp.class, StudentEnrollApp.class,
                    StudentSeniorsApp.class, StudentAcademicOfficeServices.class);

            MenuItem item = findFunctionalityWithPath(student, 0, "consult", "curriculum");
            item.setOrd(0);
            findFunctionalityWithPath(student, 0, "enroll", "shift-enrollment").setLayout("one-col");
        }

        {
            MenuContainer menu = make(root, RoleType.PERSON, "Pessoal", "Personal");
            install(menu, PersonalAreaApp.class, HomepageApp.class, ExternalApplicationsApp.class);
            findFunctionalityWithPath(menu, 0, "personal-area", "information").setOrd(0);
        }

        {
            LocalizedString str = new LocalizedString(PT, "Docência").with(EN, "Teacher");
            MenuContainer menu = new MenuContainer(root, true, "role(TEACHER) | professors", str, str, "teaching");
            install(menu, TeacherTeachingApp.class, TeacherTutorApp.class, TeacherFinalWorkApp.class, TeacherPhdApp.class,
                    TeacherMobilityApp.class);
            MenuFunctionality item = findFunctionalityWithPath(menu, 0, "teaching", "execution-course-management");
            item.setLayout("one-col");
            item.setVisible(false);
        }

        {
            install(install(root, DepartmentMemberApp.class), DepartmentMemberTeacherApp.class,
                    DepartmentMemberDepartmentApp.class, DepartmentMemberAccompanimentApp.class,
                    DepartmentMemberPresidentApp.class, DepartmentMemberMessagingApp.class);
        }

        {
            install(install(root, RAMApplication.class), RAMPeriodsApp.class, RAMSchedulesApp.class, RAMEvaluationsApp.class,
                    RAMExecutionCoursesApp.class, RAMCurriculumHistoricApp.class, RAMFirstYearShiftsApp.class);
        }

        {
            MenuContainer menu = make(root, RoleType.COORDINATOR, "Coordenador", "Coordinator");
            install(menu, CoordinatorManagementApp.class, CoordinatorPhdApp.class);
            MenuItem item = findFunctionalityWithPath(menu, 0, "manage", "degree");
            item.setVisible(false);
            item.setLayout("one-col");
            item.setOrd(4);
        }

        {
            install(install(root, ScientificCouncilApplication.class), ScientificBolonhaProcessApp.class,
                    ScientificDisserationsApp.class, ScientificCreditsApp.class, ScientificCommunicationApp.class,
                    ScientificApplicationsApp.class, ScientificTeachersApp.class);
        }

        {
            MenuContainer item =
                    install(make(root, RoleType.PERSONNEL_SECTION, "Área de Pessoal", "Personnel Section"),
                            PersonnelSectionApplication.class);
            findFunctionalityWithPath(item, 0, "find-person").setOrd(0);
        }

        {
            MenuContainer menu = install(root, DepartmentAdmOfficeApp.class);

            makeRedirect(make(menu, RoleType.DEPARTMENT_ADMINISTRATIVE_OFFICE, "Docentes", "External Teachers"),
                    "http://fenix-ashes.ist.utl.pt/professoresexternos", "Docentes Externos", "External Teachers");

            install(menu, DepartmentAdmOfficeViewApp.class, DepartmentAdmOfficeTeachersApp.class,
                    DepartmentAdmOfficeCreditsApp.class, DepartmentAdmOfficeExpectationsApp.class,
                    DepartmentAdmOfficeStudentsApp.class, DepartmentAdmOfficeListingsApp.class,
                    DepartmentAdmOfficeGroupsApp.class, DepartmentAdmOfficeExamsApp.class, DepartmentAdmOfficeMessagingApp.class);
        }

        {
            LocalizedString str = new LocalizedString(PT, "Gestão de Contas").with(EN, "Account Management");
            MenuContainer menu = new MenuContainer(root, true, "(role(OPERATOR) | #managers)", str, str, "account-management");

            makeRedirect(install(menu, OperatorApplication.class), "https://ciist.ist.utl.pt/ciistadmin/admin", "Gerar Password",
                    "Generate Password");

            install(menu, ManagerPersonManagementApp.class, ManagerPeopleApp.class);
        }

        {
            install(install(root, GepApplication.class), GepPortalApp.class, GepInquiriesApp.class, GepAlumniApp.class,
                    GepRegisteredDegreeCandidaciesApp.class, GepRAIDESApp.class);
        }

        {
            install(install(root, ReadDelegateDegreeDispatchAction.class), DelegateConsultApp.class, DelegateMessagingApp.class,
                    DelegateParticipateApp.class);
        }

        {

            install(make(root, RoleType.DIRECTIVE_COUNCIL, "Conselho Directivo", "Directive Council"),
                    DirectiveCouncilApplication.class, DirectiveCouncilControlApp.class,
                    DirectiveCouncilExternalSupervision.class, DirectiveCouncilCareerWorkshops.class);
        }

        {
            install(install(root, BolonhaManagerApplication.class), CompetenceCourseManagementApp.class,
                    CurricularPlansManagementApp.class);
        }

        {
            install(install(root, CandidateApplication.class), CandidateCandidaciesApp.class);
        }

        {
            install(make(root, RoleType.LIBRARY, "Biblioteca", "Library"), LibraryApplication.class);
        }

        {
            install(install(root, InternationalRelationsApplication.class), InternRelationsInternshipApp.class,
                    InternRelationsConsultApp.class, InternRelationsMobilityApp.class);
        }

        {
            install(install(root, AlumniHomeDA.class), AlumniAcademicPathApp.class, AlumniProfessionalInfoApp.class,
                    AlumniFormationApp.class, AlumniAcademicServicesApp.class);
        }

        {
            install(make(root, RoleType.EXAM_COORDINATOR, "Avaliação", "Exam Coordination"), ExamCoordinationApplication.class);
        }

        {
            install(install(root, PedagogicalCouncilApp.class), PedagogicalBolonhaProcessApp.class,
                    PedagogicalCommunicationApp.class, PedagogicalDelegatesApp.class, PedagogicalControlApp.class,
                    TutorshipApp.class);
        }

        {
            install(make(root, RoleType.PUBLIC_RELATIONS_OFFICE, "Gabinete de Relações Públicas", "Public Relations Office"),
                    PublicRelationsApplication.class, PublicRelationsAlumniApp.class);
        }

        {
            install(make(root, RoleType.RESEARCHER, "Curriculum", "Curriculum"), ResearcherApplication.CurriculumApp.class,
                    ResearcherApplication.ResearcherResearchUnitApp.class, ResearcherApplication.ResearcherFinalWorkApp.class);
        }

        {
            install(install(root, ManagerApplications.class), ManagerSystemManagementApp.class,
                    ManagerBolonhaTransitionApp.class, ManagerMessagesAndNoticesApp.class,
                    ManagerOrganizationalStructureApp.class, ManagerExecutionsApp.class, ManagerPaymentsApp.class,
                    ManagerStudentsApp.class);
        }

        {
            install(make(root, RoleType.RESIDENCE_MANAGER, "Núcleo de Alojamentos", "Residence Manager"),
                    ResidenceManagerApplication.class);
        }

        {
            install(make(root, RoleType.WEBSITE_MANAGER, "Gestão do Website", "Website Manager"), ListSitesAction.class)
            .setLayout("one-col");
        }

        {
            install(install(root, ExternalSupervisionApplication.class), ExternalSupervisionConsultApp.class);
        }

        {
            install(root, RectorateApplication.class);
        }

        {
            install(make(root, RoleType.IDENTIFICATION_CARD_MANAGER, "Cartões de Identificação", "Identification Cards"),
                    IdCardsApp.class);
        }

        {
            install(install(root, NapeApplication.class), NapeRegisteredCandidaciesApp.class, NapeCandidaciesApp.class);
        }

        {
            LocalizedString str = new LocalizedString(PT, "Administração Académica").with(EN, "Academic Administration");
            install(new MenuContainer(root, true, "academic(scope=ADMINISTRATION)", str, str, "academic-administration"),
                    AcademicAdministrationApplication.class, AcademicAdminListingsApp.class, AcademicAdminDCPApp.class,
                    AcademicAdminPricesApp.class, AcademicAdminExtraCurricularApp.class, AcademicAdminInstitutionsApp.class,
                    AcademicAdminMarksheetApp.class, AcademicAdminPaymentsApp.class, AcademicAdminContributorsApp.class,
                    AcademicAdminScholarshipsApp.class, AcademicAdminEquivalencesApp.class, AcademicAdminCalendarsApp.class,
                    AcademicAdminExecutionsApp.class, MasterDegreeCandidatesApp.class, MasterDegreeDfaApp.class);
        }

        {
            install(install(root, AcademicAdminOfficeApp.class), AcademicAdminStudentsApp.class, AcademicAdminServicesApp.class,
                    AcademicAdminCandidaciesApp.class, AcademicAdminDocumentsApp.class, AcademicAdminPhdApp.class);
        }

        {
            LocalizedString title = new LocalizedString(PT, "Gestão de Espaços").with(EN, "Space Management");
            MenuContainer menu =
                    install(new MenuContainer(root, true, "role(RESOURCE_ALLOCATION_MANAGER) | role(SPACE_MANAGER)", title,
                            title, "space-management"), SpacesController.class);

            findFunctionalityWithPath(menu, 0, "spaces-occupations-requests-my").delete();

            MenuContainer menuContainer =
                    findFunctionalityWithPath(root, 0, "teaching", "teaching", "view-curriculum-historic").getParent();

            LocalizedString createOccupations = new LocalizedString(PT, "Reserva de Salas").with(EN, "Room Reservation");
            new MenuFunctionality(menuContainer, true, "/spaces/occupations/requests/my", "bennu-spring", "anyone",
                    createOccupations, createOccupations, "room-reservation");

        }

        {
            install(root, "bennu-admin");
            install(root, "bennu-io-ui");
            install(root, "bennu-scheduler-ui");
        }

    }

    private static MenuContainer make(MenuContainer parent, RoleType role, String pt, String en) {
        LocalizedString title = new LocalizedString(PT, pt).with(EN, en);
        return new MenuContainer(parent, true, "role(" + role.name() + ")", title, title, en.toLowerCase().replace(' ', '-'));
    }

    private static MenuContainer install(MenuContainer parent, Class<?> appClass) {
        return install(parent, appClass.getName());
    }

    private static void install(MenuContainer parent, Class<?>... apps) {
        for (Class<?> appClass : apps) {
            install(parent, appClass.getName());
        }
    }

    private static MenuContainer install(MenuContainer parent, String appname) {
        Application app = ApplicationRegistry.getAppByKey(appname);
        return new MenuContainer(parent, app);
    }

    private static void makeRedirect(MenuContainer parent, String path, String pt, String en) {
        LocalizedString str = new LocalizedString(PT, pt).with(EN, en);
        new MenuFunctionality(parent, true, path, "redirect", "anyone", str, str, en.toLowerCase().replace(' ', '-'));
    }

    private static final MenuFunctionality findFunctionalityWithPath(MenuContainer container, int startIndex, String... parts) {
        // 1)
        if (parts.length == startIndex) {
            return container.findInitialContent();
        }

        // 2)
        for (MenuItem child : container.getOrderedChild()) {
            if (child.getPath().equals(parts[startIndex])) {
                if (child.isMenuFunctionality()) {
                    return child.getAsMenuFunctionality();
                } else {
                    return findFunctionalityWithPath(child.getAsMenuContainer(), startIndex + 1, parts);
                }
            }
        }

        // 3)
        return null;
    }

}
