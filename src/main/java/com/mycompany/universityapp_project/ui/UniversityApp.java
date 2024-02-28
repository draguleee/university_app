package com.mycompany.universityapp_project.ui;

import com.mycompany.universityapp_project.qr.StudentsManager;
import com.mycompany.universityapp_project.qr.SubjectsManager;
import com.mycompany.universityapp_project.qr.DepartmentsManager;
import java.sql.*;
import javax.swing.*;
import java.util.logging.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import com.mycompany.universityapp_project.model.*;
import com.mycompany.universityapp_project.service.*;


public class UniversityApp extends JFrame {
    
    // Services
    private final UniversityService universityService;
    private final AttendancesService attendancesService;
    private final DepartmentsService departmentsService;
    private final ExamsService examsService;
    private final GradesService gradesService;
    private final StudentsService studentsService;
    private final SubjectsService subjectsService;    
    
    // QR codes manager & viewer
    private QrCodeViewer qrCodeViewer;
    private final DepartmentsManager departmentsManager;
    private final SubjectsManager subjectsManager;
    private final StudentsManager studentsManager;

    private final LocalTime lt = LocalTime.now().truncatedTo(ChronoUnit.SECONDS);

    
    public UniversityApp(UniversityService us) throws SQLException {
        this.universityService = us;
        this.attendancesService = new AttendancesService(ConnectionManager.getConnection());
        this.departmentsService = new DepartmentsService(ConnectionManager.getConnection());
        this.examsService = new ExamsService(ConnectionManager.getConnection());
        this.gradesService = new GradesService(ConnectionManager.getConnection());
        this.studentsService = new StudentsService(ConnectionManager.getConnection());
        this.subjectsService = new SubjectsService(ConnectionManager.getConnection());
        this.departmentsManager = new DepartmentsManager();
        this.subjectsManager = new SubjectsManager();
        this.studentsManager = new StudentsManager();
        setTitle("University Desktop App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        departmentsTab = new javax.swing.JPanel();
        addDepartmentPanel = new javax.swing.JPanel();
        addDepartment = new javax.swing.JLabel();
        addDepartmentId = new javax.swing.JLabel();
        tfDepartmentId = new javax.swing.JTextField();
        addDepartmentName = new javax.swing.JLabel();
        tfDepartmentName = new javax.swing.JTextField();
        addYearsOfStudy = new javax.swing.JLabel();
        tfYearsOfStudy = new javax.swing.JTextField();
        addType = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox<>();
        btAddDepartment = new javax.swing.JButton();
        btGetDepartmentsQr = new javax.swing.JButton();
        deleteDepartmentPanel = new javax.swing.JPanel();
        deleteDepartment = new javax.swing.JLabel();
        deleteDepartmentId = new javax.swing.JLabel();
        cbDeleteDepartment = new javax.swing.JComboBox<>();
        btGetDepartmentsForDeletion = new javax.swing.JButton();
        btDeleteDepartment = new javax.swing.JButton();
        selectDepartmentsPanel = new javax.swing.JPanel();
        selectDepartments = new javax.swing.JLabel();
        selectByYears = new javax.swing.JLabel();
        tfGetYears = new javax.swing.JTextField();
        btSelectByYears = new javax.swing.JButton();
        selectByType = new javax.swing.JLabel();
        tfGetType = new javax.swing.JTextField();
        btSelectByType = new javax.swing.JButton();
        viewDepartment = new javax.swing.JScrollPane();
        viewDepartmentTable = new javax.swing.JTable();
        spDepartmentLogs = new javax.swing.JScrollPane();
        taDepartmentLogs = new javax.swing.JTextArea();
        subjectsTab = new javax.swing.JPanel();
        addSubjectPanel = new javax.swing.JPanel();
        addSubject = new javax.swing.JLabel();
        addsDepartmentId = new javax.swing.JLabel();
        cbDepartmentId = new javax.swing.JComboBox<>();
        getDepartmentIds = new javax.swing.JButton();
        addSubjectId = new javax.swing.JLabel();
        tfSubjectId = new javax.swing.JTextField();
        addSubjectName = new javax.swing.JLabel();
        tfSubjectName = new javax.swing.JTextField();
        addProfessor = new javax.swing.JLabel();
        tfProfessor = new javax.swing.JTextField();
        addCredits = new javax.swing.JLabel();
        tfCredits = new javax.swing.JTextField();
        btAddSubject = new javax.swing.JButton();
        btGeSubjectsQrCodes = new javax.swing.JButton();
        deleteSubjectPanel = new javax.swing.JPanel();
        deleteSubject = new javax.swing.JLabel();
        deleteSubjectId = new javax.swing.JLabel();
        cbDeleteSubject = new javax.swing.JComboBox<>();
        btGetSubjectsForDeletion = new javax.swing.JButton();
        btDeleteSubject = new javax.swing.JButton();
        selectSubjectPanel = new javax.swing.JPanel();
        selectSubject = new javax.swing.JLabel();
        selectByDepartment = new javax.swing.JLabel();
        tfGetDepartment = new javax.swing.JTextField();
        btSelectByDept = new javax.swing.JButton();
        selectByProf = new javax.swing.JLabel();
        tfGetProfessor = new javax.swing.JTextField();
        btSelectByProf = new javax.swing.JButton();
        selectByCredits = new javax.swing.JLabel();
        tfGetCredits = new javax.swing.JTextField();
        btSelectByCredits = new javax.swing.JButton();
        viewSubject = new javax.swing.JScrollPane();
        viewSubjectTable = new javax.swing.JTable();
        spSubjectLogs = new javax.swing.JScrollPane();
        taSubjectLogs = new javax.swing.JTextArea();
        studentsTab = new javax.swing.JPanel();
        addStudentPanel = new javax.swing.JPanel();
        addStudent = new javax.swing.JLabel();
        addStudentId = new javax.swing.JLabel();
        tfStudentId = new javax.swing.JTextField();
        addStudentDepartmentId = new javax.swing.JLabel();
        cbAddDepartmentId = new javax.swing.JComboBox<>();
        btGetDepartments = new javax.swing.JButton();
        addName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        addSurname = new javax.swing.JLabel();
        tfSurname = new javax.swing.JTextField();
        addAddress = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        btAddStudent = new javax.swing.JButton();
        addPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        btGetStudentsQrCodes = new javax.swing.JButton();
        deleteStudentPanel = new javax.swing.JPanel();
        deleteStudent = new javax.swing.JLabel();
        deleteStudentId = new javax.swing.JLabel();
        cbDeleteStudent = new javax.swing.JComboBox<>();
        btGetStudentsForDeletion = new javax.swing.JButton();
        btDeleteStudent = new javax.swing.JButton();
        selectStudentPanel = new javax.swing.JPanel();
        selectStudent = new javax.swing.JLabel();
        selectDeptId = new javax.swing.JLabel();
        tfGetDept = new javax.swing.JTextField();
        btSelectByDepartment = new javax.swing.JButton();
        viewStudent = new javax.swing.JScrollPane();
        viewStudentTable = new javax.swing.JTable();
        spStudentLogs = new javax.swing.JScrollPane();
        taStudentLogs = new javax.swing.JTextArea();
        attendancesTab = new javax.swing.JPanel();
        addAttendancePanel = new javax.swing.JPanel();
        addAttendance = new javax.swing.JLabel();
        addAttendanceId = new javax.swing.JLabel();
        tfAttendanceId = new javax.swing.JTextField();
        addDeptId = new javax.swing.JLabel();
        cbAddDept = new javax.swing.JComboBox<>();
        btGetDeptIds = new javax.swing.JButton();
        addAttendanceStudent = new javax.swing.JLabel();
        cbAddStudentId = new javax.swing.JComboBox<>();
        btGetStudentId = new javax.swing.JButton();
        addAttendanceSubject = new javax.swing.JLabel();
        cbAddSubjectId = new javax.swing.JComboBox<>();
        btGetSubjectId = new javax.swing.JButton();
        addAttendances = new javax.swing.JLabel();
        tfAttendances = new javax.swing.JTextField();
        btAddAttendance = new javax.swing.JButton();
        deleteAttendancePanel = new javax.swing.JPanel();
        deleteAttendance = new javax.swing.JLabel();
        deleteAttendanceId = new javax.swing.JLabel();
        cbDeleteAttendance = new javax.swing.JComboBox<>();
        btGetAttendanceId = new javax.swing.JButton();
        btDeleteAttendance = new javax.swing.JButton();
        eligibleStudentsPanel = new javax.swing.JPanel();
        eligibleStudents = new javax.swing.JLabel();
        eligibleDepartmentId = new javax.swing.JLabel();
        cbEligibleDepartmentId = new javax.swing.JComboBox<>();
        btEligibleGetDeptId = new javax.swing.JButton();
        eligibleSubjectId = new javax.swing.JLabel();
        cbEligibleSubjectId = new javax.swing.JComboBox<>();
        btEligibleGetSubjectId = new javax.swing.JButton();
        btDisplayEligibleStudents = new javax.swing.JButton();
        viewAttendance = new javax.swing.JScrollPane();
        viewAttendanceTable = new javax.swing.JTable();
        spAttendanceLogs = new javax.swing.JScrollPane();
        taAttendanceLogs = new javax.swing.JTextArea();
        examsTab = new javax.swing.JPanel();
        addExamPanel = new javax.swing.JPanel();
        addExam = new javax.swing.JLabel();
        addExamId = new javax.swing.JLabel();
        tfAddExamId = new javax.swing.JTextField();
        addSubjId = new javax.swing.JLabel();
        cbSubjectId = new javax.swing.JComboBox<>();
        btGetSubjectIds = new javax.swing.JButton();
        addExamType = new javax.swing.JLabel();
        cbAddExamType = new javax.swing.JComboBox<>();
        addExamDate = new javax.swing.JLabel();
        tfExamDate = new javax.swing.JTextField();
        btAddExam = new javax.swing.JButton();
        deleteExamPanel = new javax.swing.JPanel();
        deleteExam = new javax.swing.JLabel();
        deleteExamId = new javax.swing.JLabel();
        cbDeleteExam = new javax.swing.JComboBox<>();
        btGetExamForDeletion = new javax.swing.JButton();
        btDeleteExam = new javax.swing.JButton();
        selectExamPanel = new javax.swing.JPanel();
        selectExam = new javax.swing.JLabel();
        selectExamId = new javax.swing.JLabel();
        tfSelectExamId = new javax.swing.JTextField();
        btSelectExamId = new javax.swing.JButton();
        selectExamType = new javax.swing.JLabel();
        tfSelectExamType = new javax.swing.JTextField();
        btSelectExamType = new javax.swing.JButton();
        viewExam = new javax.swing.JScrollPane();
        viewExamTable = new javax.swing.JTable();
        spExamLogs = new javax.swing.JScrollPane();
        taExamLogs = new javax.swing.JTextArea();
        gradesTab = new javax.swing.JPanel();
        addGradePanel = new javax.swing.JPanel();
        addGrade = new javax.swing.JLabel();
        addGradeId = new javax.swing.JLabel();
        tfAddGradeId = new javax.swing.JTextField();
        addGradeDepartmentId = new javax.swing.JLabel();
        cbAddGradeDepartmentId = new javax.swing.JComboBox<>();
        btGetEligibleDeptId = new javax.swing.JButton();
        addGradeStudentId = new javax.swing.JLabel();
        cbAddGradeStudentId = new javax.swing.JComboBox<>();
        btGetEligibleStudents = new javax.swing.JButton();
        addGradeExamId = new javax.swing.JLabel();
        cbAddGradeExamId = new javax.swing.JComboBox<>();
        btGetExamId = new javax.swing.JButton();
        addGrades = new javax.swing.JLabel();
        tfGrade = new javax.swing.JTextField();
        btAddGrade = new javax.swing.JButton();
        deleteGradePanel = new javax.swing.JPanel();
        deleteGrade = new javax.swing.JLabel();
        deleteGradeId = new javax.swing.JLabel();
        cbDeleteGrade = new javax.swing.JComboBox<>();
        btGetGradeForDeletion = new javax.swing.JButton();
        btDeleteGrade = new javax.swing.JButton();
        selectGradePanel = new javax.swing.JPanel();
        selectGrade = new javax.swing.JLabel();
        selectGradeByStudentId = new javax.swing.JLabel();
        selGradeByStudentId = new javax.swing.JTextField();
        btSelGradeByStudentId = new javax.swing.JButton();
        selectGradeByExamId = new javax.swing.JLabel();
        selGradeByExamId = new javax.swing.JTextField();
        btSelGradeByExamId = new javax.swing.JButton();
        viewGrade = new javax.swing.JScrollPane();
        viewGradeTable = new javax.swing.JTable();
        spGradeLogs = new javax.swing.JScrollPane();
        taGradeLogs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedPaneStateChanged(evt);
            }
        });

        addDepartmentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addDepartmentPanel.setPreferredSize(new java.awt.Dimension(424, 269));

        addDepartment.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addDepartment.setText("Add Department");

        addDepartmentId.setText("Department ID");

        addDepartmentName.setText("Department Name");

        addYearsOfStudy.setText("Years of Study");

        addType.setText("Type");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select value...", "LICENTA", "MASTER", "DOCTORAT" }));

        btAddDepartment.setText("Add Department");
        btAddDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDepartmentActionPerformed(evt);
            }
        });

        btGetDepartmentsQr.setText("Get Depts. QR Codes");
        btGetDepartmentsQr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetDepartmentsQrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDepartmentPanelLayout = new javax.swing.GroupLayout(addDepartmentPanel);
        addDepartmentPanel.setLayout(addDepartmentPanelLayout);
        addDepartmentPanelLayout.setHorizontalGroup(
            addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(addDepartment))
                    .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                                .addComponent(btAddDepartment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btGetDepartmentsQr))
                            .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                                    .addComponent(addDepartmentName)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                                    .addComponent(addDepartmentId)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                                    .addComponent(addYearsOfStudy)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfYearsOfStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                                    .addComponent(addType)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        addDepartmentPanelLayout.setVerticalGroup(
            addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDepartmentPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(addDepartment)
                .addGap(18, 18, 18)
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDepartmentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDepartmentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfYearsOfStudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addYearsOfStudy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addType))
                .addGap(29, 29, 29)
                .addGroup(addDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddDepartment)
                    .addComponent(btGetDepartmentsQr))
                .addGap(28, 28, 28))
        );

        deleteDepartmentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        deleteDepartmentPanel.setPreferredSize(new java.awt.Dimension(347, 92));

        deleteDepartment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteDepartment.setText("Delete Department");

        deleteDepartmentId.setText("Dept. ID");

        cbDeleteDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetDepartmentsForDeletion.setText("Get IDs");
        btGetDepartmentsForDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetDepartmentsForDeletionActionPerformed(evt);
            }
        });

        btDeleteDepartment.setText("Delete");
        btDeleteDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteDepartmentPanelLayout = new javax.swing.GroupLayout(deleteDepartmentPanel);
        deleteDepartmentPanel.setLayout(deleteDepartmentPanelLayout);
        deleteDepartmentPanelLayout.setHorizontalGroup(
            deleteDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteDepartmentPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(deleteDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteDepartment)
                    .addGroup(deleteDepartmentPanelLayout.createSequentialGroup()
                        .addComponent(deleteDepartmentId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDeleteDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGetDepartmentsForDeletion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeleteDepartment)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        deleteDepartmentPanelLayout.setVerticalGroup(
            deleteDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteDepartmentPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(deleteDepartment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteDepartmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDeleteDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetDepartmentsForDeletion)
                    .addComponent(btDeleteDepartment)
                    .addComponent(deleteDepartmentId))
                .addGap(14, 14, 14))
        );

        selectDepartmentsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        selectDepartments.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectDepartments.setText("Select Departments");

        selectByYears.setText("By years");

        btSelectByYears.setText("Go");
        btSelectByYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByYearsActionPerformed(evt);
            }
        });

        selectByType.setText("By type");

        btSelectByType.setText("Go");
        btSelectByType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectDepartmentsPanelLayout = new javax.swing.GroupLayout(selectDepartmentsPanel);
        selectDepartmentsPanel.setLayout(selectDepartmentsPanelLayout);
        selectDepartmentsPanelLayout.setHorizontalGroup(
            selectDepartmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectDepartmentsPanelLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(selectDepartments)
                .addGap(95, 95, 95))
            .addGroup(selectDepartmentsPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(selectDepartmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(selectDepartmentsPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(selectByType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfGetType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelectByType, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(selectDepartmentsPanelLayout.createSequentialGroup()
                        .addComponent(selectByYears)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfGetYears, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSelectByYears, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectDepartmentsPanelLayout.setVerticalGroup(
            selectDepartmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectDepartmentsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(selectDepartments)
                .addGap(18, 18, 18)
                .addGroup(selectDepartmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGetYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByYears)
                    .addComponent(selectByYears))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectDepartmentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGetType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByType)
                    .addComponent(selectByType))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewDepartmentTable.setModel(departmentsService.getDepartmentsTableModel());
        viewDepartment.setViewportView(viewDepartmentTable);

        taDepartmentLogs.setColumns(20);
        taDepartmentLogs.setRows(5);
        spDepartmentLogs.setViewportView(taDepartmentLogs);

        javax.swing.GroupLayout departmentsTabLayout = new javax.swing.GroupLayout(departmentsTab);
        departmentsTab.setLayout(departmentsTabLayout);
        departmentsTabLayout.setHorizontalGroup(
            departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(departmentsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addDepartmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteDepartmentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(spDepartmentLogs, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectDepartmentsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        departmentsTabLayout.setVerticalGroup(
            departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(departmentsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(departmentsTabLayout.createSequentialGroup()
                        .addComponent(deleteDepartmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectDepartmentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addDepartmentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(departmentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spDepartmentLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Departments", departmentsTab);

        addSubjectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addSubjectPanel.setForeground(new java.awt.Color(255, 255, 255));

        addSubject.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addSubject.setText("Add Subject");

        addsDepartmentId.setText("Department ID");

        cbDepartmentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));

        getDepartmentIds.setText("Get IDs");
        getDepartmentIds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDepartmentIdsActionPerformed(evt);
            }
        });

        addSubjectId.setText("Subject ID");

        addSubjectName.setText("Subject Name");

        addProfessor.setText("Professor");

        addCredits.setText("Credits");

        btAddSubject.setText("Add Subject");
        btAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddSubjectActionPerformed(evt);
            }
        });

        btGeSubjectsQrCodes.setText("Get Sbj. QR Codes");
        btGeSubjectsQrCodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeSubjectsQrCodesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addSubjectPanelLayout = new javax.swing.GroupLayout(addSubjectPanel);
        addSubjectPanel.setLayout(addSubjectPanelLayout);
        addSubjectPanelLayout.setHorizontalGroup(
            addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSubjectPanelLayout.createSequentialGroup()
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSubjectPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addSubjectPanelLayout.createSequentialGroup()
                                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addSubjectId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addSubjectName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addProfessor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addCredits, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addsDepartmentId, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbDepartmentId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfSubjectName)
                                    .addComponent(tfProfessor)
                                    .addComponent(tfCredits)
                                    .addComponent(tfSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getDepartmentIds))
                            .addGroup(addSubjectPanelLayout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btGeSubjectsQrCodes))
                            .addGroup(addSubjectPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btAddSubject))))
                    .addGroup(addSubjectPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(addSubject)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        addSubjectPanelLayout.setVerticalGroup(
            addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSubjectPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addSubject)
                .addGap(18, 18, 18)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsDepartmentId)
                    .addComponent(getDepartmentIds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSubjectId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSubjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSubjectName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProfessor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCredits)
                    .addComponent(tfCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddSubject)
                    .addComponent(btGeSubjectsQrCodes))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        deleteSubjectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        deleteSubject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteSubject.setText("Delete Subject");

        deleteSubjectId.setText("Subject ID");

        cbDeleteSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetSubjectsForDeletion.setText("Get IDs");
        btGetSubjectsForDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetSubjectsForDeletionActionPerformed(evt);
            }
        });

        btDeleteSubject.setText("Delete");
        btDeleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteSubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteSubjectPanelLayout = new javax.swing.GroupLayout(deleteSubjectPanel);
        deleteSubjectPanel.setLayout(deleteSubjectPanelLayout);
        deleteSubjectPanelLayout.setHorizontalGroup(
            deleteSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSubjectPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(deleteSubjectId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGetSubjectsForDeletion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeleteSubject)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteSubjectPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteSubject)
                .addGap(115, 115, 115))
        );
        deleteSubjectPanelLayout.setVerticalGroup(
            deleteSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteSubjectPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDeleteSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSubjectId)
                    .addComponent(btGetSubjectsForDeletion)
                    .addComponent(btDeleteSubject))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        selectSubjectPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        selectSubject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectSubject.setText("Select Subjects");

        selectByDepartment.setText("By Dept.");

        btSelectByDept.setText("Go");
        btSelectByDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByDeptActionPerformed(evt);
            }
        });

        selectByProf.setText("By Prof.");

        btSelectByProf.setText("Go");
        btSelectByProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByProfActionPerformed(evt);
            }
        });

        selectByCredits.setText("By Credits");

        btSelectByCredits.setText("Go");
        btSelectByCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByCreditsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectSubjectPanelLayout = new javax.swing.GroupLayout(selectSubjectPanel);
        selectSubjectPanel.setLayout(selectSubjectPanelLayout);
        selectSubjectPanelLayout.setHorizontalGroup(
            selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectSubjectPanelLayout.createSequentialGroup()
                .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectSubjectPanelLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(selectSubject))
                    .addGroup(selectSubjectPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectByCredits)
                            .addComponent(selectByProf)
                            .addComponent(selectByDepartment))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfGetDepartment)
                            .addComponent(tfGetProfessor)
                            .addComponent(tfGetCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSelectByProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btSelectByDept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSelectByCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectSubjectPanelLayout.setVerticalGroup(
            selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectSubjectPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectSubject)
                .addGap(18, 18, 18)
                .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGetDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByDept)
                    .addComponent(selectByDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGetProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByProf)
                    .addComponent(selectByProf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectSubjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGetCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByCredits)
                    .addComponent(selectByCredits))
                .addGap(24, 24, 24))
        );

        viewSubjectTable.setModel(subjectsService.getSubjectsTableModel());
        viewSubject.setViewportView(viewSubjectTable);

        taSubjectLogs.setColumns(20);
        taSubjectLogs.setRows(5);
        spSubjectLogs.setViewportView(taSubjectLogs);

        javax.swing.GroupLayout subjectsTabLayout = new javax.swing.GroupLayout(subjectsTab);
        subjectsTab.setLayout(subjectsTabLayout);
        subjectsTabLayout.setHorizontalGroup(
            subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(subjectsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addSubjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteSubjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spSubjectLogs)
                    .addComponent(selectSubjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        subjectsTabLayout.setVerticalGroup(
            subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(subjectsTabLayout.createSequentialGroup()
                        .addComponent(deleteSubjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectSubjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addSubjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(subjectsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spSubjectLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Subjects", subjectsTab);

        addStudentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addStudentPanel.setPreferredSize(new java.awt.Dimension(424, 269));

        addStudent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addStudent.setText("Add Student");

        addStudentId.setText("Student ID");

        addStudentDepartmentId.setText("Department ID");

        cbAddDepartmentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetDepartments.setText("Get IDs");
        btGetDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetDepartmentsActionPerformed(evt);
            }
        });

        addName.setText("Name");

        addSurname.setText("Surname");

        addAddress.setText("Address");

        btAddStudent.setText("Add Student");
        btAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddStudentActionPerformed(evt);
            }
        });

        addPhone.setText("Phone");

        btGetStudentsQrCodes.setText("Get Stud. QR Codes");
        btGetStudentsQrCodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetStudentsQrCodesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addStudentPanelLayout = new javax.swing.GroupLayout(addStudentPanel);
        addStudentPanel.setLayout(addStudentPanelLayout);
        addStudentPanelLayout.setHorizontalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(addStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudentPanelLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addStudentId)
                            .addComponent(addName)
                            .addComponent(addStudentDepartmentId)
                            .addComponent(addSurname)
                            .addComponent(addAddress)
                            .addComponent(addPhone))
                        .addGap(18, 18, 18)
                        .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudentPanelLayout.createSequentialGroup()
                                .addComponent(cbAddDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btGetDepartments))
                            .addComponent(tfStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addStudentPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btAddStudent)
                        .addGap(42, 42, 42)
                        .addComponent(btGetStudentsQrCodes)))
                .addGap(36, 36, 36))
        );
        addStudentPanelLayout.setVerticalGroup(
            addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudentPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(addStudent)
                .addGap(12, 12, 12)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStudentId)
                    .addComponent(tfStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStudentDepartmentId)
                    .addComponent(btGetDepartments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSurname)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddStudent)
                    .addComponent(btGetStudentsQrCodes))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        deleteStudentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        deleteStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteStudent.setText("Delete Student");

        deleteStudentId.setText("Student ID");

        cbDeleteStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        btGetStudentsForDeletion.setText("Get IDs");
        btGetStudentsForDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetStudentsForDeletionActionPerformed(evt);
            }
        });

        btDeleteStudent.setText("Delete");
        btDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteStudentPanelLayout = new javax.swing.GroupLayout(deleteStudentPanel);
        deleteStudentPanel.setLayout(deleteStudentPanelLayout);
        deleteStudentPanelLayout.setHorizontalGroup(
            deleteStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteStudentPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(deleteStudentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGetStudentsForDeletion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeleteStudent)
                .addGap(18, 18, 18))
            .addGroup(deleteStudentPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(deleteStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteStudentPanelLayout.setVerticalGroup(
            deleteStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteStudentPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteStudent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteStudentId)
                    .addComponent(cbDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetStudentsForDeletion)
                    .addComponent(btDeleteStudent))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        selectStudentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        selectStudent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectStudent.setText("Select Students");

        selectDeptId.setText("By Dept.");

        btSelectByDepartment.setText("Go");
        btSelectByDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectByDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectStudentPanelLayout = new javax.swing.GroupLayout(selectStudentPanel);
        selectStudentPanel.setLayout(selectStudentPanelLayout);
        selectStudentPanelLayout.setHorizontalGroup(
            selectStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectStudentPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(selectStudent)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectStudentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectDeptId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfGetDept, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSelectByDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        selectStudentPanelLayout.setVerticalGroup(
            selectStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectStudentPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(selectStudent)
                .addGap(28, 28, 28)
                .addGroup(selectStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDeptId)
                    .addComponent(tfGetDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectByDepartment))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewStudentTable.setModel(studentsService.getStudentsTableModel());
        viewStudent.setViewportView(viewStudentTable);

        taStudentLogs.setColumns(20);
        taStudentLogs.setRows(5);
        spStudentLogs.setViewportView(taStudentLogs);

        javax.swing.GroupLayout studentsTabLayout = new javax.swing.GroupLayout(studentsTab);
        studentsTab.setLayout(studentsTabLayout);
        studentsTabLayout.setHorizontalGroup(
            studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spStudentLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(deleteStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        studentsTabLayout.setVerticalGroup(
            studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(studentsTabLayout.createSequentialGroup()
                        .addComponent(deleteStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectStudentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spStudentLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Students", studentsTab);

        addAttendancePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addAttendancePanel.setPreferredSize(new java.awt.Dimension(424, 269));

        addAttendance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addAttendance.setText("Add Attendance");

        addAttendanceId.setText("Attendance ID");

        addDeptId.setText("Department ID");

        cbAddDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetDeptIds.setText("Get IDs");
        btGetDeptIds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetDeptIdsActionPerformed(evt);
            }
        });

        addAttendanceStudent.setText("Student ID");

        cbAddStudentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetStudentId.setText("Get IDs");
        btGetStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetStudentIdActionPerformed(evt);
            }
        });

        addAttendanceSubject.setText("Subject ID");

        cbAddSubjectId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbAddSubjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddSubjectIdActionPerformed(evt);
            }
        });

        btGetSubjectId.setText("Get IDs");
        btGetSubjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetSubjectIdActionPerformed(evt);
            }
        });

        addAttendances.setText("Attendances");

        btAddAttendance.setText("Add Attendance");
        btAddAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAttendanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addAttendancePanelLayout = new javax.swing.GroupLayout(addAttendancePanel);
        addAttendancePanel.setLayout(addAttendancePanelLayout);
        addAttendancePanelLayout.setHorizontalGroup(
            addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAttendancePanelLayout.createSequentialGroup()
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAttendancePanelLayout.createSequentialGroup()
                        .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addAttendancePanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(addAttendanceId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAttendanceId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addAttendancePanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAttendancePanelLayout.createSequentialGroup()
                                        .addComponent(addDeptId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAttendancePanelLayout.createSequentialGroup()
                                        .addComponent(addAttendanceStudent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbAddStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAttendancePanelLayout.createSequentialGroup()
                                        .addComponent(addAttendanceSubject)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbAddSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAttendancePanelLayout.createSequentialGroup()
                                        .addComponent(addAttendances)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btAddAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfAttendances, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGetDeptIds)
                            .addComponent(btGetSubjectId)
                            .addComponent(btGetStudentId)))
                    .addGroup(addAttendancePanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(addAttendance)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        addAttendancePanelLayout.setVerticalGroup(
            addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAttendancePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addAttendance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAttendanceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttendanceId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDeptId)
                    .addComponent(btGetDeptIds, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttendanceStudent)
                    .addComponent(btGetStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttendanceSubject)
                    .addComponent(btGetSubjectId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAttendances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttendances))
                .addGap(18, 18, 18)
                .addComponent(btAddAttendance)
                .addGap(32, 32, 32))
        );

        deleteAttendancePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        deleteAttendance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteAttendance.setText("Delete Attendance");

        deleteAttendanceId.setText("Attendance ID");

        cbDeleteAttendance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetAttendanceId.setText("Get IDs");
        btGetAttendanceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetAttendanceIdActionPerformed(evt);
            }
        });

        btDeleteAttendance.setText("Delete");
        btDeleteAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteAttendanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteAttendancePanelLayout = new javax.swing.GroupLayout(deleteAttendancePanel);
        deleteAttendancePanel.setLayout(deleteAttendancePanelLayout);
        deleteAttendancePanelLayout.setHorizontalGroup(
            deleteAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAttendancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteAttendanceId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbDeleteAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGetAttendanceId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeleteAttendance)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteAttendancePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteAttendance)
                .addGap(99, 99, 99))
        );
        deleteAttendancePanelLayout.setVerticalGroup(
            deleteAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteAttendancePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteAttendance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDeleteAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetAttendanceId)
                    .addComponent(btDeleteAttendance)
                    .addComponent(deleteAttendanceId))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        eligibleStudentsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        eligibleStudents.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        eligibleStudents.setText("Eligible Students for Exams");

        eligibleDepartmentId.setText("Department ID");

        cbEligibleDepartmentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btEligibleGetDeptId.setText("Go");
        btEligibleGetDeptId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEligibleGetDeptIdActionPerformed(evt);
            }
        });

        eligibleSubjectId.setText("Subject ID");

        cbEligibleSubjectId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btEligibleGetSubjectId.setText("Go");
        btEligibleGetSubjectId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEligibleGetSubjectIdActionPerformed(evt);
            }
        });

        btDisplayEligibleStudents.setText("Display Eligible Students");
        btDisplayEligibleStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDisplayEligibleStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eligibleStudentsPanelLayout = new javax.swing.GroupLayout(eligibleStudentsPanel);
        eligibleStudentsPanel.setLayout(eligibleStudentsPanelLayout);
        eligibleStudentsPanelLayout.setHorizontalGroup(
            eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eligibleStudentsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDisplayEligibleStudents)
                .addGap(92, 92, 92))
            .addGroup(eligibleStudentsPanelLayout.createSequentialGroup()
                .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eligibleStudentsPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(eligibleStudents))
                    .addGroup(eligibleStudentsPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eligibleSubjectId)
                            .addComponent(eligibleDepartmentId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbEligibleDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbEligibleSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEligibleGetDeptId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(btEligibleGetSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eligibleStudentsPanelLayout.setVerticalGroup(
            eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eligibleStudentsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(eligibleStudents)
                .addGap(18, 18, 18)
                .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eligibleDepartmentId)
                    .addComponent(cbEligibleDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEligibleGetDeptId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(eligibleStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEligibleSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEligibleGetSubjectId)
                    .addComponent(eligibleSubjectId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDisplayEligibleStudents)
                .addGap(16, 16, 16))
        );

        viewAttendanceTable.setModel(attendancesService.getAttendancesTableModel());
        viewAttendance.setViewportView(viewAttendanceTable);

        taAttendanceLogs.setColumns(20);
        taAttendanceLogs.setRows(5);
        spAttendanceLogs.setViewportView(taAttendanceLogs);

        javax.swing.GroupLayout attendancesTabLayout = new javax.swing.GroupLayout(attendancesTab);
        attendancesTab.setLayout(attendancesTabLayout);
        attendancesTabLayout.setHorizontalGroup(
            attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addAttendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteAttendancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spAttendanceLogs)
                    .addComponent(eligibleStudentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        attendancesTabLayout.setVerticalGroup(
            attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendancesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(attendancesTabLayout.createSequentialGroup()
                        .addComponent(deleteAttendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eligibleStudentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addAttendancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(attendancesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spAttendanceLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Attendances", attendancesTab);

        addExamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addExamPanel.setPreferredSize(new java.awt.Dimension(424, 269));

        addExam.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addExam.setText("Add Exam");

        addExamId.setText("Exam ID");

        addSubjId.setText("Subject ID");

        cbSubjectId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetSubjectIds.setText("Get IDs");
        btGetSubjectIds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetSubjectIdsActionPerformed(evt);
            }
        });

        addExamType.setText("Exam Type");

        cbAddExamType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select value...", "COLOCVIU", "SCRIS", "ORAL", "PROIECT" }));
        cbAddExamType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAddExamTypeActionPerformed(evt);
            }
        });

        addExamDate.setText("Exam Date");

        btAddExam.setText("Add Exam");
        btAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddExamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addExamPanelLayout = new javax.swing.GroupLayout(addExamPanel);
        addExamPanel.setLayout(addExamPanelLayout);
        addExamPanelLayout.setHorizontalGroup(
            addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExamPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(btAddExam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addExamPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addSubjId)
                    .addComponent(addExamId)
                    .addComponent(addExamType)
                    .addComponent(addExamDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addExam)
                    .addGroup(addExamPanelLayout.createSequentialGroup()
                        .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfAddExamId)
                            .addComponent(cbAddExamType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfExamDate)
                            .addComponent(cbSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGetSubjectIds)))
                .addGap(82, 82, 82))
        );
        addExamPanelLayout.setVerticalGroup(
            addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addExamPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addExam)
                .addGap(18, 18, 18)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addExamId)
                    .addComponent(tfAddExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubjId)
                    .addComponent(cbSubjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetSubjectIds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addExamType)
                    .addComponent(cbAddExamType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addExamDate)
                    .addComponent(tfExamDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btAddExam)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        deleteExamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        deleteExam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteExam.setText("Delete Exam");

        deleteExamId.setText("Exam ID");

        cbDeleteExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetExamForDeletion.setText("Get IDs");
        btGetExamForDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetExamForDeletionActionPerformed(evt);
            }
        });

        btDeleteExam.setText("Delete");
        btDeleteExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteExamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteExamPanelLayout = new javax.swing.GroupLayout(deleteExamPanel);
        deleteExamPanel.setLayout(deleteExamPanelLayout);
        deleteExamPanelLayout.setHorizontalGroup(
            deleteExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteExamPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(deleteExamId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDeleteExam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGetExamForDeletion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDeleteExam)
                .addGap(21, 21, 21))
            .addGroup(deleteExamPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(deleteExam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteExamPanelLayout.setVerticalGroup(
            deleteExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteExamPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteExam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteExamId)
                    .addComponent(cbDeleteExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetExamForDeletion)
                    .addComponent(btDeleteExam))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        selectExamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        selectExam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectExam.setText("Select Exam");

        selectExamId.setText("By Subject ID");

        btSelectExamId.setText("Go");
        btSelectExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectExamIdActionPerformed(evt);
            }
        });

        selectExamType.setText("By Exam Type");

        btSelectExamType.setText("Go");
        btSelectExamType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelectExamTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectExamPanelLayout = new javax.swing.GroupLayout(selectExamPanel);
        selectExamPanel.setLayout(selectExamPanelLayout);
        selectExamPanelLayout.setHorizontalGroup(
            selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectExamPanelLayout.createSequentialGroup()
                .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectExamPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(selectExam))
                    .addGroup(selectExamPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectExamType)
                            .addComponent(selectExamId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfSelectExamId)
                            .addComponent(tfSelectExamType, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSelectExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSelectExamType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectExamPanelLayout.setVerticalGroup(
            selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectExamPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(selectExam)
                .addGap(18, 18, 18)
                .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectExamId)
                    .addComponent(tfSelectExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectExamId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selectExamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectExamType)
                    .addComponent(tfSelectExamType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelectExamType))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewExamTable.setModel(examsService.getExamsTableModel());
        viewExam.setViewportView(viewExamTable);

        taExamLogs.setColumns(20);
        taExamLogs.setRows(5);
        spExamLogs.setViewportView(taExamLogs);

        javax.swing.GroupLayout examsTabLayout = new javax.swing.GroupLayout(examsTab);
        examsTab.setLayout(examsTabLayout);
        examsTabLayout.setHorizontalGroup(
            examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(examsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addExamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewExam, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(selectExamPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spExamLogs)
                    .addComponent(deleteExamPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        examsTabLayout.setVerticalGroup(
            examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, examsTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(examsTabLayout.createSequentialGroup()
                        .addComponent(deleteExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectExamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(addExamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(examsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewExam, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spExamLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Exams", examsTab);

        addGradePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        addGradePanel.setPreferredSize(new java.awt.Dimension(424, 269));

        addGrade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addGrade.setText("Add Grade");

        addGradeId.setText("Grade ID");

        addGradeDepartmentId.setText("Department ID");

        cbAddGradeDepartmentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetEligibleDeptId.setText("Get IDs");
        btGetEligibleDeptId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetEligibleDeptIdActionPerformed(evt);
            }
        });

        addGradeStudentId.setText("Eligible Student ID");

        cbAddGradeStudentId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetEligibleStudents.setText("Get IDs");
        btGetEligibleStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetEligibleStudentsActionPerformed(evt);
            }
        });

        addGradeExamId.setText("Exam ID");

        cbAddGradeExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetExamId.setText("Get IDs");
        btGetExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetExamIdActionPerformed(evt);
            }
        });

        addGrades.setText("Grade");

        btAddGrade.setText("Add Grade");
        btAddGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addGradePanelLayout = new javax.swing.GroupLayout(addGradePanel);
        addGradePanel.setLayout(addGradePanelLayout);
        addGradePanelLayout.setHorizontalGroup(
            addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradePanelLayout.createSequentialGroup()
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addGradePanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(addGrade))
                    .addGroup(addGradePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addGradeStudentId)
                            .addComponent(addGradeId)
                            .addComponent(addGradeExamId)
                            .addComponent(addGrades)
                            .addComponent(addGradeDepartmentId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btAddGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                            .addComponent(cbAddGradeExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbAddGradeStudentId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfAddGradeId)
                                .addComponent(cbAddGradeDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btGetExamId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGetEligibleStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGetEligibleDeptId))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addGradePanelLayout.setVerticalGroup(
            addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGradePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddGradeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGradeId))
                .addGap(7, 7, 7)
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGradeDepartmentId)
                    .addComponent(cbAddGradeDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetEligibleDeptId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddGradeStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGradeStudentId)
                    .addComponent(btGetEligibleStudents))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAddGradeExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGradeExamId)
                    .addComponent(btGetExamId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addGrades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btAddGrade)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        deleteGradePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        deleteGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteGrade.setText("Delete Grade");

        deleteGradeId.setText("Grade ID");

        cbDeleteGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        btGetGradeForDeletion.setText("Get IDs");
        btGetGradeForDeletion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGetGradeForDeletionActionPerformed(evt);
            }
        });

        btDeleteGrade.setText("Delete");
        btDeleteGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteGradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteGradePanelLayout = new javax.swing.GroupLayout(deleteGradePanel);
        deleteGradePanel.setLayout(deleteGradePanelLayout);
        deleteGradePanelLayout.setHorizontalGroup(
            deleteGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteGradePanelLayout.createSequentialGroup()
                .addGroup(deleteGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteGradePanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(deleteGrade))
                    .addGroup(deleteGradePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(deleteGradeId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDeleteGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGetGradeForDeletion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteGrade)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteGradePanelLayout.setVerticalGroup(
            deleteGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteGradePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(deleteGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(deleteGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteGradeId)
                    .addComponent(cbDeleteGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGetGradeForDeletion)
                    .addComponent(btDeleteGrade))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        selectGradePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        selectGrade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectGrade.setText("Select Grade");

        selectGradeByStudentId.setText("By Student ID");

        btSelGradeByStudentId.setText("Go");
        btSelGradeByStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelGradeByStudentIdActionPerformed(evt);
            }
        });

        selectGradeByExamId.setText("By Exam ID");

        btSelGradeByExamId.setText("Go");
        btSelGradeByExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelGradeByExamIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectGradePanelLayout = new javax.swing.GroupLayout(selectGradePanel);
        selectGradePanel.setLayout(selectGradePanelLayout);
        selectGradePanelLayout.setHorizontalGroup(
            selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectGradePanelLayout.createSequentialGroup()
                .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(selectGradePanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectGradeByExamId)
                            .addComponent(selectGradeByStudentId))
                        .addGap(18, 18, 18)
                        .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selGradeByStudentId)
                            .addComponent(selGradeByExamId)))
                    .addGroup(selectGradePanelLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(selectGrade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSelGradeByStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelGradeByExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectGradePanelLayout.setVerticalGroup(
            selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectGradePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(selectGrade)
                .addGap(22, 22, 22)
                .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGradeByStudentId)
                    .addComponent(selGradeByStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelGradeByStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(selectGradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGradeByExamId)
                    .addComponent(selGradeByExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSelGradeByExamId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewGradeTable.setModel(gradesService.getGradesTableModel());
        viewGrade.setViewportView(viewGradeTable);

        taGradeLogs.setColumns(20);
        taGradeLogs.setRows(5);
        spGradeLogs.setViewportView(taGradeLogs);

        javax.swing.GroupLayout gradesTabLayout = new javax.swing.GroupLayout(gradesTab);
        gradesTab.setLayout(gradesTabLayout);
        gradesTabLayout.setHorizontalGroup(
            gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addGradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteGradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spGradeLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(selectGradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        gradesTabLayout.setVerticalGroup(
            gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addGradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gradesTabLayout.createSequentialGroup()
                        .addComponent(deleteGradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectGradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gradesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(spGradeLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("Grades", gradesTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedPaneStateChanged
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();
        switch (index) {
            case 0: updateDepartmentsTab(); break;
            case 1: updateSubjectsTab(); break;
            case 2: updateStudentsTab(); break;
            case 3: updateAttendancesTab(); break;
            case 4: updateExamsTab(); break;
            case 5: updateGradesTab(); break;
        }
    }//GEN-LAST:event_tabbedPaneStateChanged

    private void btGetExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetExamIdActionPerformed
        cbAddGradeExamId.removeAllItems();
        examsService.populateExamsForEligibleStudents(cbAddGradeExamId, (String) cbAddGradeDepartmentId.getSelectedItem(), (String) cbAddGradeStudentId.getSelectedItem());
        taGradeLogs.append("\n" + lt + ": Successfully fetched Exams.");
    }//GEN-LAST:event_btGetExamIdActionPerformed

    private void btGetEligibleStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetEligibleStudentsActionPerformed
        cbAddGradeStudentId.removeAllItems();
        studentsService.populateEligibleStudentsByDepartment(cbAddGradeStudentId, (String) cbAddGradeDepartmentId.getSelectedItem());
        taGradeLogs.append("\n" + lt + ": Successfully fetched Students.");
    }//GEN-LAST:event_btGetEligibleStudentsActionPerformed

    private void btSelectExamTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectExamTypeActionPerformed
        taExamLogs.setText("");
        taExamLogs.append(examsService.findExamsByExamType(tfSelectExamType.getText()) + "\n");
        tfSelectExamType.setText("");
    }//GEN-LAST:event_btSelectExamTypeActionPerformed

    private void btSelectExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectExamIdActionPerformed
        taExamLogs.setText("");
        taExamLogs.append(examsService.findExamsBySubjectId(tfSelectExamId.getText()) + "\n");
        tfSelectExamId.setText("");
    }//GEN-LAST:event_btSelectExamIdActionPerformed

    private void btDeleteExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteExamActionPerformed
        try {
            if(cbDeleteExam.getSelectedItem().equals("")) {
                taExamLogs.append("\n" + lt + ": Please select an Exam from the list before deleting!");
            } else {
                examsService.deleteExam("exams", "exam", (String) cbDeleteExam.getSelectedItem());
                cbDeleteExam.removeAllItems();
                taExamLogs.append("\n" + lt + ": Exam deleted successfully!");
            }
        } catch (SQLSyntaxErrorException ex) {
            taExamLogs.append("\n" + lt + ": Please select an Exam from the list before deleting!");
        } catch (NullPointerException ex) {
            taExamLogs.append("\n" + lt + ": Please select an Exam from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteExamActionPerformed

    private void btGetExamForDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetExamForDeletionActionPerformed
        cbDeleteExam.removeAllItems();
        universityService.populate(cbDeleteExam, "exam_id", "exams");
        taExamLogs.append("\n" + lt + ": Successfully fetched Exams.");
    }//GEN-LAST:event_btGetExamForDeletionActionPerformed

    private void btAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddExamActionPerformed
        try {
            if(tfAddExamId.getText().equals("") || cbSubjectId.getSelectedItem().equals("") || cbAddExamType.getSelectedItem().equals("") || tfExamDate.equals("")) {
                taExamLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else {
                examsService.insertExam(new Exam(tfAddExamId.getText(), (String) cbSubjectId.getSelectedItem(), (String) cbAddExamType.getSelectedItem(), tfExamDate.getText()));
                taExamLogs.append("\n" + lt + ": Exam " + tfAddExamId.getText() + ": " + (String)cbSubjectId.getSelectedItem() + "(" + (String)cbAddExamType.getSelectedItem() + ") added successfully!");
            }
        } catch (NumberFormatException ex) {
            taExamLogs.append("\n" + lt + ": Please fill out all the fields!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            taExamLogs.append("\n" + lt + ": " + tfAddExamId.getText() + " is already added. Please add another Exam.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfAddExamId.setText("");
        cbSubjectId.removeAllItems();
        cbAddExamType.setSelectedIndex(0);
        tfExamDate.setText("");
    }//GEN-LAST:event_btAddExamActionPerformed

    private void btGetSubjectIdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetSubjectIdsActionPerformed
        cbSubjectId.removeAllItems();
        universityService.populate(cbSubjectId, "subject_id", "subjects");
        taExamLogs.append("\n" + lt + ": Successfully fetched Subjects.");
    }//GEN-LAST:event_btGetSubjectIdsActionPerformed

    private void btDisplayEligibleStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDisplayEligibleStudentsActionPerformed
        taAttendanceLogs.setText("");
        taAttendanceLogs.append(studentsService.findEligibleStudents((String) cbEligibleDepartmentId.getSelectedItem(), (String) cbEligibleSubjectId.getSelectedItem()) + "\n");
        cbEligibleDepartmentId.removeAllItems();
        cbEligibleSubjectId.removeAllItems();
    }//GEN-LAST:event_btDisplayEligibleStudentsActionPerformed

    private void btEligibleGetSubjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEligibleGetSubjectIdActionPerformed
        cbEligibleSubjectId.removeAllItems();
        universityService.populateBy(cbEligibleSubjectId, "subjects", "subject_id", "department_id", (String) cbEligibleDepartmentId.getSelectedItem());
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Subjects.");
    }//GEN-LAST:event_btEligibleGetSubjectIdActionPerformed

    private void btEligibleGetDeptIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEligibleGetDeptIdActionPerformed
        cbEligibleDepartmentId.removeAllItems();
        universityService.populateByDistinct(cbEligibleDepartmentId, "departments", "students", "department_id","");
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_btEligibleGetDeptIdActionPerformed

    private void btDeleteAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteAttendanceActionPerformed
        try {
            if(cbDeleteAttendance.getSelectedItem().equals("")) {
                taAttendanceLogs.append("\n" + lt + ": Please select an Attendance from the list before deleting!");
            } else {
                attendancesService.deleteAttendance("attendances", "attendance", (String) cbDeleteAttendance.getSelectedItem());
                cbDeleteAttendance.removeAllItems();
                taAttendanceLogs.append("\n" + lt + ": Attendance deleted successfully!");
            }
        } catch (SQLSyntaxErrorException ex) {
            taAttendanceLogs.append("\n" + lt + ": Please select an Attendance from the list before deleting!");
        } catch (NullPointerException ex) {
            taAttendanceLogs.append("\n" + lt + ": Please select an Attendance from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteAttendanceActionPerformed

    private void btGetAttendanceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetAttendanceIdActionPerformed
        cbDeleteAttendance.removeAllItems();
        universityService.populate(cbDeleteAttendance, "attendance_id", "attendances");
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Attendances.");
    }//GEN-LAST:event_btGetAttendanceIdActionPerformed

    private void btAddAttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAttendanceActionPerformed
        try {
            if(tfAttendanceId.getText().equals("") || cbAddDept.getSelectedItem().equals("") || cbAddStudentId.getSelectedItem().equals("") || cbAddSubjectId.getSelectedItem().equals("") || tfAttendances.getText().equals("")) {
                taAttendanceLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else {
                attendancesService.insertAttendance(new Attendance(tfAttendanceId.getText(), (String) cbAddStudentId.getSelectedItem(), (String) cbAddSubjectId.getSelectedItem(), Integer.parseInt(tfAttendances.getText())));
                taAttendanceLogs.append("\n" + lt + ": Attendance " + tfAttendanceId.getText() + " for student " + cbAddStudentId.getSelectedItem() + " added successfully!");
            }
        } catch (NumberFormatException ex) {
            taAttendanceLogs.append("\n" + lt + ": Incorrect type for field Attendances!");
        } catch (NullPointerException ex) {
            taAttendanceLogs.append("\n" + lt + ": Please fill out all the fields!");
        }  catch (SQLIntegrityConstraintViolationException ex) {
            taAttendanceLogs.append("\n" + lt + ": " + tfAttendanceId.getText() + " is already added. Please add another Attendance.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfAttendanceId.setText("");
        cbAddDept.removeAllItems();
        cbAddStudentId.removeAllItems();
        cbAddSubjectId.removeAllItems();
        tfAttendances.setText("");
    }//GEN-LAST:event_btAddAttendanceActionPerformed

    private void btGetSubjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetSubjectIdActionPerformed
        cbAddSubjectId.removeAllItems();
        universityService.populateBy(cbAddSubjectId, "subjects", "subject_id", "department_id", (String) cbAddDept.getSelectedItem());
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Subjects.");
    }//GEN-LAST:event_btGetSubjectIdActionPerformed

    private void cbAddSubjectIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddSubjectIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAddSubjectIdActionPerformed

    private void btGetStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetStudentIdActionPerformed
        cbAddStudentId.removeAllItems();
        universityService.populateBy(cbAddStudentId, "students", "student_id", "department_id", (String) cbAddDept.getSelectedItem());
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Students.");
    }//GEN-LAST:event_btGetStudentIdActionPerformed

    private void btGetDeptIdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetDeptIdsActionPerformed
        cbAddDept.removeAllItems();
        universityService.populateByDistinct(cbAddDept, "departments", "students", "department_id", "");
        taAttendanceLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_btGetDeptIdsActionPerformed

    private void btSelectByDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByDepartmentActionPerformed
        taStudentLogs.setText("");
        taStudentLogs.append(studentsService.findStudentsByDepartmentId(tfGetDept.getText()) + "\n");
        tfGetDept.setText("");
    }//GEN-LAST:event_btSelectByDepartmentActionPerformed

    private void btDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteStudentActionPerformed
        try {
            if(cbDeleteStudent.getSelectedItem().equals("")) {
                taStudentLogs.append("\n" + lt + ": Please select a Student from the list before deleting!");
            } else {
                studentsManager.deleteQrCode((String) cbDeleteStudent.getSelectedItem());
                studentsService.deleteStudent("students", "student", (String) cbDeleteStudent.getSelectedItem());
                if (qrCodeViewer != null) {
                    qrCodeViewer.getListModel().clear();
                    qrCodeViewer.getImageLabel().setIcon(null);
                    SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(studentsManager.getFolderPath()));
                }
                cbDeleteStudent.removeAllItems();
                taStudentLogs.append("\n" + lt + ": Student deleted successfully!");
            }
        } catch (NullPointerException ex) {
            taStudentLogs.append("\n" + lt + ": Please select a Student from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteStudentActionPerformed

    private void btGetStudentsForDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetStudentsForDeletionActionPerformed
        cbDeleteStudent.removeAllItems();
        universityService.populate(cbDeleteStudent, "student_id", "students");
        taStudentLogs.append("\n" + lt + ": Successfully fetched Students.");
    }//GEN-LAST:event_btGetStudentsForDeletionActionPerformed

    private void btAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddStudentActionPerformed
        try {
            if(tfStudentId.getText().equals("") || cbAddDepartmentId.getSelectedItem().equals("") || tfName.getText().equals("") || tfSurname.getText().equals("") || tfAddress.getText().equals("") || tfPhone.getText().equals("")) {
                taStudentLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else {
                Student student = new Student(tfStudentId.getText(), (String) cbAddDepartmentId.getSelectedItem(), tfName.getText(), tfSurname.getText(), tfAddress.getText(), tfAddress.getText());
                studentsManager.generateQrCode(student, () -> {
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    if (qrCodeViewer != null) {
                        SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(studentsManager.getFolderPath()));
                    }
                });
                studentsService.insertStudent(student);
                taStudentLogs.append("\n" + lt + ": Student " + tfStudentId.getText() + " (" + tfSurname.getText() + ") added successfully!");
            }
        } catch (NullPointerException ex) {
            taStudentLogs.append("\n" + lt + ": Please fill out all the fields!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            taStudentLogs.append("\n" + lt + ": " + tfStudentId.getText() + " is already added. Please add another Student.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfStudentId.setText("");
        cbAddDepartmentId.removeAllItems();
        tfName.setText("");
        tfSurname.setText("");
        tfAddress.setText("");
        tfPhone.setText("");
    }//GEN-LAST:event_btAddStudentActionPerformed

    private void btGetDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetDepartmentsActionPerformed
        cbAddDepartmentId.removeAllItems();
        universityService.populateByDistinct(cbAddDepartmentId, "subjects", "departments", "department_id","");
        taStudentLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_btGetDepartmentsActionPerformed

    private void btSelectByCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByCreditsActionPerformed
        try {
            taSubjectLogs.setText("");
            taSubjectLogs.append(subjectsService.findSubjectsByCredits(Integer.parseInt(tfGetCredits.getText())) + "\n");
            tfGetCredits.setText("");
        } catch (NumberFormatException ex) {
            taSubjectLogs.append("\n" + lt + ": Please enter a valid value before searching for a subject!");
        }
    }//GEN-LAST:event_btSelectByCreditsActionPerformed

    private void btSelectByProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByProfActionPerformed
        taSubjectLogs.setText("");
        taSubjectLogs.append(subjectsService.findSubjectsByProfessor(tfGetProfessor.getText()) + "\n");
        tfGetProfessor.setText("");
    }//GEN-LAST:event_btSelectByProfActionPerformed

    private void btSelectByDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByDeptActionPerformed
        taSubjectLogs.setText("");
        taSubjectLogs.append(subjectsService.findSubjectsByDepartmentId(tfGetDepartment.getText()) + "\n");
        tfGetDepartment.setText("");
    }//GEN-LAST:event_btSelectByDeptActionPerformed

    private void btDeleteSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteSubjectActionPerformed
        try {
            if(cbDeleteSubject.getSelectedItem().equals("")) {
                taSubjectLogs.append("\n" + lt + ": Please select a Subject from the list before deleting!");
            } else {
                subjectsManager.deleteQrCode((String) cbDeleteSubject.getSelectedItem());
                subjectsService.deleteSubject("subjects", "subject", (String) cbDeleteSubject.getSelectedItem());
                if (qrCodeViewer != null) {
                    qrCodeViewer.getListModel().clear();
                    qrCodeViewer.getImageLabel().setIcon(null);
                    SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(subjectsManager.getFolderPath()));
                }
                cbDeleteSubject.removeAllItems();
                taSubjectLogs.append("\n" + lt + ": Subject deleted successfully!");
            }
        } catch (NullPointerException ex) {
            taSubjectLogs.append("\n" + lt + ": Please select a Subject from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteSubjectActionPerformed

    private void btGetSubjectsForDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetSubjectsForDeletionActionPerformed
        cbDeleteSubject.removeAllItems();
        universityService.populate(cbDeleteSubject, "subject_id", "subjects");
        taSubjectLogs.append("\n" + lt + ": Successfully fetched Subjects.");
    }//GEN-LAST:event_btGetSubjectsForDeletionActionPerformed

    private void btAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddSubjectActionPerformed
        try {
            if(cbDepartmentId.getSelectedItem().equals("") || tfSubjectId.getText().equals("") || tfSubjectName.getText().equals("") || tfProfessor.getText().equals("")) {
                taSubjectLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else {
                Subject subject = new Subject((String) cbDepartmentId.getSelectedItem(), tfSubjectId.getText(), tfSubjectName.getText(), tfProfessor.getText(), Integer.parseInt(tfCredits.getText()));
                subjectsManager.generateQrCode(subject, () -> {
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    if (qrCodeViewer != null) {
                        SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(subjectsManager.getFolderPath()));
                    }
                });
                subjectsService.insertSubject(subject);
                taSubjectLogs.append("\n" + lt + ": Subject " + tfSubjectName.getText() + " (" + tfSubjectId.getText() + ") added successfully!");
            }
        } catch (NumberFormatException ex) {
            taSubjectLogs.append("\n" + lt + ": Incorrect type for field Credits!");
        } catch (NullPointerException ex) {
            taSubjectLogs.append("\n" + lt + ": Please fill out all the fields!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            taSubjectLogs.append("\n" + lt + ": " + tfSubjectId.getText() + " is already added. Please add another Subject.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbDepartmentId.removeAllItems();
        tfSubjectId.setText("");
        tfSubjectName.setText("");
        tfProfessor.setText("");
        tfCredits.setText("");
    }//GEN-LAST:event_btAddSubjectActionPerformed

    private void getDepartmentIdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDepartmentIdsActionPerformed
        cbDepartmentId.removeAllItems();
        universityService.populate(cbDepartmentId, "department_id", "departments");
        taSubjectLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_getDepartmentIdsActionPerformed

    private void btSelectByTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByTypeActionPerformed
        taDepartmentLogs.setText("");
        taDepartmentLogs.append(departmentsService.findDepartmentsByType(tfGetType.getText()) + "\n");
        tfGetType.setText("");
    }//GEN-LAST:event_btSelectByTypeActionPerformed

    private void btSelectByYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelectByYearsActionPerformed
        try {
            taDepartmentLogs.setText("");
            taDepartmentLogs.append(departmentsService.findDepartmentsByYears(Integer.parseInt(tfGetYears.getText())) + "\n");
            tfGetYears.setText("");
        }
        catch (NumberFormatException ex) {
            taDepartmentLogs.append("\n" + lt + ": Please enter a valid value before searching for a department!");
        }
    }//GEN-LAST:event_btSelectByYearsActionPerformed

    private void btDeleteDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteDepartmentActionPerformed
        try {
            if(cbDeleteDepartment.getSelectedItem().equals("")) {
                taDepartmentLogs.append("\n" + lt + ": Please select a Department from the list before deleting!");
            } else {
                departmentsManager.deleteQrCode((String) cbDeleteDepartment.getSelectedItem());
                departmentsService.deleteDepartment("departments", "department", (String) cbDeleteDepartment.getSelectedItem());
                if (qrCodeViewer != null) {
                    qrCodeViewer.getListModel().clear();
                    qrCodeViewer.getImageLabel().setIcon(null);
                    SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(departmentsManager.getFolderPath()));
                }
                cbDeleteDepartment.removeAllItems();
                taDepartmentLogs.append("\n" + lt + ": Department deleted successfully!");
            }
        } catch (NullPointerException ex) {
            taDepartmentLogs.append("\n" + lt + ": Please select a Department from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteDepartmentActionPerformed

    private void btGetDepartmentsForDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetDepartmentsForDeletionActionPerformed
        cbDeleteDepartment.removeAllItems();
        universityService.populate(cbDeleteDepartment, "department_id", "departments");
        taDepartmentLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_btGetDepartmentsForDeletionActionPerformed

    private void btAddDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDepartmentActionPerformed
        try {
            if(tfDepartmentId.getText().equals("") || tfDepartmentName.getText().equals("") || cbType.getSelectedItem().equals("Select value...")) {
                taDepartmentLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else if(Integer.parseInt(tfYearsOfStudy.getText()) < 1) {
                taDepartmentLogs.append("\n" + lt + ": Years of study cannot be smaller than 1!");
            } else if(cbType.getSelectedItem().equals("LICENTA") && Integer.parseInt(tfYearsOfStudy.getText()) > 6) {
                taDepartmentLogs.append("\n" + lt + ": Years of study cannot be greater than 6 for type LICENTA");
            } else if(cbType.getSelectedItem().equals("MASTER") && Integer.parseInt(tfYearsOfStudy.getText()) > 2) {
                taDepartmentLogs.append("\n" + lt + ": Years of study cannot be greater than 2 for type MASTER");
            } else if(cbType.getSelectedItem().equals("DOCTORAT") && Integer.parseInt(tfYearsOfStudy.getText()) > 3) {
                taDepartmentLogs.append("\n" + lt + ": Years of study cannot be greater than 3 for type DOCTORAT");
            } else {
                Department department = new Department(tfDepartmentId.getText(), tfDepartmentName.getText(), Integer.parseInt(tfYearsOfStudy.getText()), (String) cbType.getSelectedItem());
                departmentsManager.generateQrCode(department, () -> {
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    if (qrCodeViewer != null) {
                        SwingUtilities.invokeLater(() -> qrCodeViewer.updateList(departmentsManager.getFolderPath()));
                    }
                });
                departmentsService.insertDepartment(department);
                taDepartmentLogs.append("\n" + lt + ": Department " + tfDepartmentName.getText() + " (" + cbType.getSelectedItem() + ") added successfully!");
            }
        } catch (NumberFormatException ex) {
            taDepartmentLogs.append("\n" + lt + ": Incorrect type for field Years of Study!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            taDepartmentLogs.append("\n" + lt + ": " + tfDepartmentId.getText() + " is already added. Please add another Department.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfDepartmentId.setText("");
        tfDepartmentName.setText("");
        tfYearsOfStudy.setText("");
        cbType.setSelectedIndex(0);
    }//GEN-LAST:event_btAddDepartmentActionPerformed

    private void btAddGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddGradeActionPerformed
        try {
            if(tfAddGradeId.getText().equals("") || cbAddGradeStudentId.getSelectedItem().equals("") || cbAddGradeExamId.getSelectedItem().equals("")) {
                taGradeLogs.append("\n" + lt + ": Please fill out all the fields!");
            } else {
                gradesService.insertGrade(new Grade(tfAddGradeId.getText(), (String) cbAddGradeStudentId.getSelectedItem(), (String) cbAddGradeExamId.getSelectedItem(), Integer.parseInt(tfGrade.getText())));
                taGradeLogs.append("\n" + lt + ": Grade " + tfAddGradeId.getText() + "for subject " + (String) cbAddGradeExamId.getSelectedItem() + " added successfully!");
            }
        } catch (NumberFormatException ex) {
            taGradeLogs.append("\n" + lt + ": Please fill out all the fields!");
        } catch (SQLIntegrityConstraintViolationException ex) {
            taGradeLogs.append("\n" + lt + ": " + tfAddGradeId.getText() + " is already added. Please add another Grade.");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfAddGradeId.setText("");
        cbAddGradeDepartmentId.removeAllItems();
        cbAddGradeStudentId.removeAllItems();
        cbAddGradeExamId.setSelectedIndex(0);
        tfGrade.setText("");
    }//GEN-LAST:event_btAddGradeActionPerformed

    private void btGetGradeForDeletionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetGradeForDeletionActionPerformed
        cbDeleteGrade.removeAllItems();
        universityService.populate(cbDeleteGrade, "grade_id", "grades");
        taGradeLogs.append("\n" + lt + ": Successfully fetched Grades.");
    }//GEN-LAST:event_btGetGradeForDeletionActionPerformed

    private void btGetEligibleDeptIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetEligibleDeptIdActionPerformed
        cbAddGradeDepartmentId.removeAllItems();
        universityService.populateByDistinct(cbAddGradeDepartmentId, "departments", "students", "department_id", "");
        taGradeLogs.append("\n" + lt + ": Successfully fetched Departments.");
    }//GEN-LAST:event_btGetEligibleDeptIdActionPerformed

    private void btDeleteGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteGradeActionPerformed
        try {
            if(cbDeleteGrade.getSelectedItem().equals("")) {
                taGradeLogs.append("\n" + lt + ": Please select a Grade from the list before deleting!");
            } else {
                gradesService.deleteGrade("grades", "grade", (String) cbDeleteGrade.getSelectedItem());
                cbDeleteGrade.removeAllItems();
                taGradeLogs.append("\n" + lt + ": Grade deleted successfully!");
            }
        } catch (SQLSyntaxErrorException ex) {
            taGradeLogs.append("\n" + lt + ": Please select a Grade from the list before deleting!");
        } catch (NullPointerException ex) {
            taGradeLogs.append("\n" + lt + ": Please select a Grade from the list before deleting!");
        } catch (SQLException ex) {
            Logger.getLogger(UniversityApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDeleteGradeActionPerformed

    private void btSelGradeByStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelGradeByStudentIdActionPerformed
        taGradeLogs.setText("");
        taGradeLogs.append(gradesService.findGradesByStudentId(selGradeByStudentId.getText()) + "\n");
        selGradeByStudentId.setText("");
    }//GEN-LAST:event_btSelGradeByStudentIdActionPerformed

    private void btSelGradeByExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelGradeByExamIdActionPerformed
        taGradeLogs.setText("");
        taGradeLogs.append(gradesService.findGradesByExamId(selGradeByExamId.getText()) + "\n");
        selGradeByExamId.setText("");
    }//GEN-LAST:event_btSelGradeByExamIdActionPerformed

    private void btGetDepartmentsQrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetDepartmentsQrActionPerformed
        qrCodeViewer = new QrCodeViewer("Departments", departmentsManager.getFolderPath());
        qrCodeViewer.updateList(departmentsManager.getFolderPath());
        qrCodeViewer.setVisible(true); 
    }//GEN-LAST:event_btGetDepartmentsQrActionPerformed

    private void btGeSubjectsQrCodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeSubjectsQrCodesActionPerformed
        qrCodeViewer = new QrCodeViewer("Subjects", subjectsManager.getFolderPath());
        qrCodeViewer.updateList(subjectsManager.getFolderPath());
        qrCodeViewer.setVisible(true); 
    }//GEN-LAST:event_btGeSubjectsQrCodesActionPerformed

    private void btGetStudentsQrCodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGetStudentsQrCodesActionPerformed
        qrCodeViewer = new QrCodeViewer("Students", studentsManager.getFolderPath());
        qrCodeViewer.updateList(studentsManager.getFolderPath());
        qrCodeViewer.setVisible(true); 
    }//GEN-LAST:event_btGetStudentsQrCodesActionPerformed

    private void cbAddExamTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAddExamTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAddExamTypeActionPerformed

    private void updateDepartmentsTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewDepartmentTable.setModel(departmentsService.getDepartmentsTableModel());
                    }
                });
            }
        }.execute();
    }
    
    private void updateSubjectsTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewSubjectTable.setModel(subjectsService.getSubjectsTableModel());
                    }
                });
            }
        }.execute();
    }
    
    private void updateStudentsTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewStudentTable.setModel(studentsService.getStudentsTableModel());
                    }
                });
            }
        }.execute();
    }
    
    private void updateAttendancesTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewAttendanceTable.setModel(attendancesService.getAttendancesTableModel());
                    }
                });
            }
        }.execute();
    }
    
    private void updateExamsTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewExamTable.setModel(examsService.getExamsTableModel());
                    }
                });
            }
        }.execute();
    }
    
    private void updateGradesTab() {
        new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws Exception {
                return null;
            }
            protected void done() {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        viewGradeTable.setModel(gradesService.getGradesTableModel());
                    }
                });
            }
        }.execute();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UniversityApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversityApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversityApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversityApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addAddress;
    private javax.swing.JLabel addAttendance;
    private javax.swing.JLabel addAttendanceId;
    private javax.swing.JPanel addAttendancePanel;
    private javax.swing.JLabel addAttendanceStudent;
    private javax.swing.JLabel addAttendanceSubject;
    private javax.swing.JLabel addAttendances;
    private javax.swing.JLabel addCredits;
    private javax.swing.JLabel addDepartment;
    private javax.swing.JLabel addDepartmentId;
    private javax.swing.JLabel addDepartmentName;
    private javax.swing.JPanel addDepartmentPanel;
    private javax.swing.JLabel addDeptId;
    private javax.swing.JLabel addExam;
    private javax.swing.JLabel addExamDate;
    private javax.swing.JLabel addExamId;
    private javax.swing.JPanel addExamPanel;
    private javax.swing.JLabel addExamType;
    private javax.swing.JLabel addGrade;
    private javax.swing.JLabel addGradeDepartmentId;
    private javax.swing.JLabel addGradeExamId;
    private javax.swing.JLabel addGradeId;
    private javax.swing.JPanel addGradePanel;
    private javax.swing.JLabel addGradeStudentId;
    private javax.swing.JLabel addGrades;
    private javax.swing.JLabel addName;
    private javax.swing.JLabel addPhone;
    private javax.swing.JLabel addProfessor;
    private javax.swing.JLabel addStudent;
    private javax.swing.JLabel addStudentDepartmentId;
    private javax.swing.JLabel addStudentId;
    private javax.swing.JPanel addStudentPanel;
    private javax.swing.JLabel addSubjId;
    private javax.swing.JLabel addSubject;
    private javax.swing.JLabel addSubjectId;
    private javax.swing.JLabel addSubjectName;
    private javax.swing.JPanel addSubjectPanel;
    private javax.swing.JLabel addSurname;
    private javax.swing.JLabel addType;
    private javax.swing.JLabel addYearsOfStudy;
    private javax.swing.JLabel addsDepartmentId;
    private javax.swing.JPanel attendancesTab;
    private javax.swing.JButton btAddAttendance;
    private javax.swing.JButton btAddDepartment;
    private javax.swing.JButton btAddExam;
    private javax.swing.JButton btAddGrade;
    private javax.swing.JButton btAddStudent;
    private javax.swing.JButton btAddSubject;
    private javax.swing.JButton btDeleteAttendance;
    private javax.swing.JButton btDeleteDepartment;
    private javax.swing.JButton btDeleteExam;
    private javax.swing.JButton btDeleteGrade;
    private javax.swing.JButton btDeleteStudent;
    private javax.swing.JButton btDeleteSubject;
    private javax.swing.JButton btDisplayEligibleStudents;
    private javax.swing.JButton btEligibleGetDeptId;
    private javax.swing.JButton btEligibleGetSubjectId;
    private javax.swing.JButton btGeSubjectsQrCodes;
    private javax.swing.JButton btGetAttendanceId;
    private javax.swing.JButton btGetDepartments;
    private javax.swing.JButton btGetDepartmentsForDeletion;
    private javax.swing.JButton btGetDepartmentsQr;
    private javax.swing.JButton btGetDeptIds;
    private javax.swing.JButton btGetEligibleDeptId;
    private javax.swing.JButton btGetEligibleStudents;
    private javax.swing.JButton btGetExamForDeletion;
    private javax.swing.JButton btGetExamId;
    private javax.swing.JButton btGetGradeForDeletion;
    private javax.swing.JButton btGetStudentId;
    private javax.swing.JButton btGetStudentsForDeletion;
    private javax.swing.JButton btGetStudentsQrCodes;
    private javax.swing.JButton btGetSubjectId;
    private javax.swing.JButton btGetSubjectIds;
    private javax.swing.JButton btGetSubjectsForDeletion;
    private javax.swing.JButton btSelGradeByExamId;
    private javax.swing.JButton btSelGradeByStudentId;
    private javax.swing.JButton btSelectByCredits;
    private javax.swing.JButton btSelectByDepartment;
    private javax.swing.JButton btSelectByDept;
    private javax.swing.JButton btSelectByProf;
    private javax.swing.JButton btSelectByType;
    private javax.swing.JButton btSelectByYears;
    private javax.swing.JButton btSelectExamId;
    private javax.swing.JButton btSelectExamType;
    private javax.swing.JComboBox<String> cbAddDepartmentId;
    private javax.swing.JComboBox<String> cbAddDept;
    private javax.swing.JComboBox<String> cbAddExamType;
    private javax.swing.JComboBox<String> cbAddGradeDepartmentId;
    private javax.swing.JComboBox<String> cbAddGradeExamId;
    private javax.swing.JComboBox<String> cbAddGradeStudentId;
    private javax.swing.JComboBox<String> cbAddStudentId;
    private javax.swing.JComboBox<String> cbAddSubjectId;
    private javax.swing.JComboBox<String> cbDeleteAttendance;
    private javax.swing.JComboBox<String> cbDeleteDepartment;
    private javax.swing.JComboBox<String> cbDeleteExam;
    private javax.swing.JComboBox<String> cbDeleteGrade;
    private javax.swing.JComboBox<String> cbDeleteStudent;
    private javax.swing.JComboBox<String> cbDeleteSubject;
    private javax.swing.JComboBox<String> cbDepartmentId;
    private javax.swing.JComboBox<String> cbEligibleDepartmentId;
    private javax.swing.JComboBox<String> cbEligibleSubjectId;
    private javax.swing.JComboBox<String> cbSubjectId;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel deleteAttendance;
    private javax.swing.JLabel deleteAttendanceId;
    private javax.swing.JPanel deleteAttendancePanel;
    private javax.swing.JLabel deleteDepartment;
    private javax.swing.JLabel deleteDepartmentId;
    private javax.swing.JPanel deleteDepartmentPanel;
    private javax.swing.JLabel deleteExam;
    private javax.swing.JLabel deleteExamId;
    private javax.swing.JPanel deleteExamPanel;
    private javax.swing.JLabel deleteGrade;
    private javax.swing.JLabel deleteGradeId;
    private javax.swing.JPanel deleteGradePanel;
    private javax.swing.JLabel deleteStudent;
    private javax.swing.JLabel deleteStudentId;
    private javax.swing.JPanel deleteStudentPanel;
    private javax.swing.JLabel deleteSubject;
    private javax.swing.JLabel deleteSubjectId;
    private javax.swing.JPanel deleteSubjectPanel;
    private javax.swing.JPanel departmentsTab;
    private javax.swing.JLabel eligibleDepartmentId;
    private javax.swing.JLabel eligibleStudents;
    private javax.swing.JPanel eligibleStudentsPanel;
    private javax.swing.JLabel eligibleSubjectId;
    private javax.swing.JPanel examsTab;
    private javax.swing.JButton getDepartmentIds;
    private javax.swing.JPanel gradesTab;
    private javax.swing.JTextField selGradeByExamId;
    private javax.swing.JTextField selGradeByStudentId;
    private javax.swing.JLabel selectByCredits;
    private javax.swing.JLabel selectByDepartment;
    private javax.swing.JLabel selectByProf;
    private javax.swing.JLabel selectByType;
    private javax.swing.JLabel selectByYears;
    private javax.swing.JLabel selectDepartments;
    private javax.swing.JPanel selectDepartmentsPanel;
    private javax.swing.JLabel selectDeptId;
    private javax.swing.JLabel selectExam;
    private javax.swing.JLabel selectExamId;
    private javax.swing.JPanel selectExamPanel;
    private javax.swing.JLabel selectExamType;
    private javax.swing.JLabel selectGrade;
    private javax.swing.JLabel selectGradeByExamId;
    private javax.swing.JLabel selectGradeByStudentId;
    private javax.swing.JPanel selectGradePanel;
    private javax.swing.JLabel selectStudent;
    private javax.swing.JPanel selectStudentPanel;
    private javax.swing.JLabel selectSubject;
    private javax.swing.JPanel selectSubjectPanel;
    private javax.swing.JScrollPane spAttendanceLogs;
    private javax.swing.JScrollPane spDepartmentLogs;
    private javax.swing.JScrollPane spExamLogs;
    private javax.swing.JScrollPane spGradeLogs;
    private javax.swing.JScrollPane spStudentLogs;
    private javax.swing.JScrollPane spSubjectLogs;
    private javax.swing.JPanel studentsTab;
    private javax.swing.JPanel subjectsTab;
    private javax.swing.JTextArea taAttendanceLogs;
    private javax.swing.JTextArea taDepartmentLogs;
    private javax.swing.JTextArea taExamLogs;
    private javax.swing.JTextArea taGradeLogs;
    private javax.swing.JTextArea taStudentLogs;
    private javax.swing.JTextArea taSubjectLogs;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField tfAddExamId;
    private javax.swing.JTextField tfAddGradeId;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfAttendanceId;
    private javax.swing.JTextField tfAttendances;
    private javax.swing.JTextField tfCredits;
    private javax.swing.JTextField tfDepartmentId;
    private javax.swing.JTextField tfDepartmentName;
    private javax.swing.JTextField tfExamDate;
    private javax.swing.JTextField tfGetCredits;
    private javax.swing.JTextField tfGetDepartment;
    private javax.swing.JTextField tfGetDept;
    private javax.swing.JTextField tfGetProfessor;
    private javax.swing.JTextField tfGetType;
    private javax.swing.JTextField tfGetYears;
    private javax.swing.JTextField tfGrade;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfProfessor;
    private javax.swing.JTextField tfSelectExamId;
    private javax.swing.JTextField tfSelectExamType;
    private javax.swing.JTextField tfStudentId;
    private javax.swing.JTextField tfSubjectId;
    private javax.swing.JTextField tfSubjectName;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfYearsOfStudy;
    private javax.swing.JScrollPane viewAttendance;
    private javax.swing.JTable viewAttendanceTable;
    private javax.swing.JScrollPane viewDepartment;
    private javax.swing.JTable viewDepartmentTable;
    private javax.swing.JScrollPane viewExam;
    private javax.swing.JTable viewExamTable;
    private javax.swing.JScrollPane viewGrade;
    private javax.swing.JTable viewGradeTable;
    private javax.swing.JScrollPane viewStudent;
    private javax.swing.JTable viewStudentTable;
    private javax.swing.JScrollPane viewSubject;
    private javax.swing.JTable viewSubjectTable;
    // End of variables declaration//GEN-END:variables


}
