import javafx.util.Pair;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Patient {
    String patientName;
    int age;
    char tower;
    GregorianCalendar dateOfReporting;
    GregorianCalendar dateOfRecovery;

    public Patient(String name, int age, char tower, GregorianCalendar reporting, GregorianCalendar recovery) {
        this.patientName = name;
        this.age = age;
        this.tower = tower;
        this.dateOfReporting = reporting;
        this.dateOfRecovery = recovery;
    }

    static void makeDatabase(Patient @NotNull [] patients) {
        GregorianCalendar startDate0 = new GregorianCalendar();
        GregorianCalendar stopDate0 = new GregorianCalendar();
        startDate0.set(2020, Calendar.APRIL, 1);
        stopDate0.set(2020, Calendar.APRIL, 1);
        stopDate0.add(GregorianCalendar.DATE, 22);
        patients[0] = new Patient("Flora", 6, 'A', startDate0, stopDate0);

        GregorianCalendar startDate1 = new GregorianCalendar();
        GregorianCalendar stopDate1 = new GregorianCalendar();
        startDate1.set(2020, Calendar.APRIL, 1);
        stopDate1.set(2020, Calendar.APRIL, 1);
        stopDate1.add(GregorianCalendar.DATE, 22);
        patients[1] = new Patient("Denys", 24, 'B', startDate1, stopDate1);

        GregorianCalendar startDate2 = new GregorianCalendar();
        GregorianCalendar stopDate2 = new GregorianCalendar();
        startDate2.set(2020, Calendar.MAY, 18);
        stopDate2.set(2020, Calendar.MAY, 18);
        stopDate2.add(GregorianCalendar.DATE, 22);
        patients[2] = new Patient("Jim", 42, 'C', startDate2, stopDate2);

        GregorianCalendar startDate3 = new GregorianCalendar();
        GregorianCalendar stopDate3 = new GregorianCalendar();
        startDate3.set(2020, Calendar.JUNE, 23);
        stopDate3.set(2020, Calendar.JUNE, 23);
        stopDate3.add(GregorianCalendar.DATE, 22);
        patients[3] = new Patient("Hazel", 87, 'D', startDate3, stopDate3);

        GregorianCalendar startDate4 = new GregorianCalendar();
        GregorianCalendar stopDate4 = new GregorianCalendar();
        startDate4.set(2020, Calendar.JUNE, 1);
        stopDate4.set(2020, Calendar.JUNE, 1);
        stopDate4.add(GregorianCalendar.DATE, 22);
        patients[4] = new Patient("Caery", 72, 'A', startDate4, stopDate4);

        GregorianCalendar startDate5 = new GregorianCalendar();
        GregorianCalendar stopDate5 = new GregorianCalendar();
        startDate5.set(2020, Calendar.JUNE, 14);
        stopDate5.set(2020, Calendar.JUNE, 14);
        stopDate5.add(GregorianCalendar.DATE, 22);
        patients[5] = new Patient("David", 7, 'B', startDate5, stopDate5);

        GregorianCalendar startDate6 = new GregorianCalendar();
        GregorianCalendar stopDate6 = new GregorianCalendar();
        startDate6.set(2020, Calendar.JUNE, 5);
        stopDate6.set(2020, Calendar.JUNE, 5);
        stopDate6.add(GregorianCalendar.DATE, 22);
        patients[6] = new Patient("Kevim", 37, 'D', startDate6, stopDate6);

        GregorianCalendar startDate7 = new GregorianCalendar();
        GregorianCalendar stopDate7 = new GregorianCalendar();
        startDate7.set(2020, Calendar.JUNE, 20);
        stopDate7.set(2020, Calendar.JUNE, 20);
        stopDate7.add(GregorianCalendar.DATE, 22);
        patients[7] = new Patient("Tom", 67, 'D', startDate7, stopDate7);

        GregorianCalendar startDate8 = new GregorianCalendar();
        GregorianCalendar stopDate8 = new GregorianCalendar();
        startDate8.set(2020, Calendar.JULY, 4);
        stopDate8.set(2020, Calendar.JULY, 4);
        stopDate8.add(GregorianCalendar.DATE, 22);
        patients[8] = new Patient("Bob", 74, 'A', startDate8, stopDate8);

        GregorianCalendar startDate9 = new GregorianCalendar();
        GregorianCalendar stopDate9 = new GregorianCalendar();
        startDate9.set(2020, Calendar.JULY, 24);
        stopDate9.set(2020, Calendar.JULY, 24);
        stopDate9.add(GregorianCalendar.DATE, 22);
        patients[9] = new Patient("Rachel", 48, 'C', startDate9, stopDate9);

        GregorianCalendar startDate10 = new GregorianCalendar();
        GregorianCalendar stopDate10 = new GregorianCalendar();
        startDate10.set(2020, Calendar.JUNE, 11);
        stopDate10.set(2020, Calendar.JUNE, 11);
        stopDate10.add(GregorianCalendar.DATE, 22);
        patients[10] = new Patient("Thomas", 21, 'C', startDate10, stopDate10);

        GregorianCalendar startDate11 = new GregorianCalendar();
        GregorianCalendar stopDate11 = new GregorianCalendar();
        startDate11.set(2020, Calendar.JUNE, 21);
        stopDate11.set(2020, Calendar.JUNE, 21);
        stopDate11.add(GregorianCalendar.DATE, 22);
        patients[11] = new Patient("Mary", 17, 'D', startDate11, stopDate11);

        GregorianCalendar startDate12 = new GregorianCalendar();
        GregorianCalendar stopDate12 = new GregorianCalendar();
        startDate12.set(2020, Calendar.AUGUST, 7);
        stopDate12.set(2020, Calendar.AUGUST, 7);
        stopDate12.add(GregorianCalendar.DATE, 22);
        patients[12] = new Patient("Smith", 89, 'A', startDate12, stopDate12);

        GregorianCalendar startDate13 = new GregorianCalendar();
        GregorianCalendar stopDate13 = new GregorianCalendar();
        startDate13.set(2020, Calendar.JUNE, 4);
        stopDate13.set(2020, Calendar.JUNE, 4);
        stopDate13.add(GregorianCalendar.DATE, 22);
        patients[13] = new Patient("Pearson", 47, 'B', startDate13, stopDate13);

        GregorianCalendar startDate14 = new GregorianCalendar();
        GregorianCalendar stopDate14 = new GregorianCalendar();
        startDate14.set(2020, Calendar.JULY, 27);
        stopDate14.set(2020, Calendar.JULY, 27);
        stopDate14.add(GregorianCalendar.DATE, 22);
        patients[14] = new Patient("Anderson", 62, 'B', startDate14, stopDate14);

        GregorianCalendar startDate15 = new GregorianCalendar();
        GregorianCalendar stopDate15 = new GregorianCalendar();
        startDate15.set(2020, Calendar.AUGUST, 1);
        stopDate15.set(2020, Calendar.AUGUST, 1);
        stopDate15.add(GregorianCalendar.DATE, 22);
        patients[15] = new Patient("Johnson", 10, 'D', startDate15, stopDate15);

        GregorianCalendar startDate16 = new GregorianCalendar();
        GregorianCalendar stopDate16 = new GregorianCalendar();
        startDate16.set(2020, Calendar.AUGUST, 9);
        stopDate16.set(2020, Calendar.AUGUST, 9);
        stopDate16.add(GregorianCalendar.DATE, 22);
        patients[16] = new Patient("Robertz", 50, 'A', startDate16, stopDate16);

        GregorianCalendar startDate17 = new GregorianCalendar();
        GregorianCalendar stopDate17 = new GregorianCalendar();
        startDate17.set(2020, Calendar.MAY, 2);
        stopDate17.set(2020, Calendar.MAY, 2);
        stopDate17.add(GregorianCalendar.DATE, 22);
        patients[17] = new Patient("Julie", 86, 'B', startDate17, stopDate17);

        GregorianCalendar startDate18 = new GregorianCalendar();
        GregorianCalendar stopDate18 = new GregorianCalendar();
        startDate18.set(2020, Calendar.JUNE, 7);
        stopDate18.set(2020, Calendar.JUNE, 7);
        stopDate18.add(GregorianCalendar.DATE, 22);
        patients[18] = new Patient("Edith", 42, 'D', startDate18, stopDate18);

        GregorianCalendar startDate19 = new GregorianCalendar();
        GregorianCalendar stopDate19 = new GregorianCalendar();
        startDate19.set(2020, Calendar.JUNE, 1);
        stopDate19.set(2020, Calendar.JUNE, 1);
        stopDate19.add(GregorianCalendar.DATE, 22);
        patients[19] = new Patient("John", 95, 'D', startDate19, stopDate19);
    }

}

class CoronaControl extends JFrame implements ActionListener {
    private JTextField DDTextField;
    private JTextField MMTextField;
    private JTextField YYYYTextField;
    private JCheckBox aCheckBox;
    private JCheckBox bCheckBox;
    private JCheckBox cCheckBox;
    private JCheckBox dCheckBox;
    private JTextField AACases;
    private JTextField BACases;
    private JTextField CACases;
    private JTextField DACases;
    private JButton findResultsButton;
    private JTextField ARCases;
    private JTextField BRCases;
    private JTextField CRCases;
    private JTextField DRCases;
    private JButton nextButton;
    private JPanel mainForm;
    private JLabel patientDeets;
    private JTable displayTable;
    Patient[] patients = new Patient[20];
    private JFrame f;
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable table = new JTable(tableModel);
    private JScrollPane scrollPane = new JScrollPane(table);

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    CoronaControl() {
        Patient.makeDatabase(patients);
        FlowLayout flowLayout = new FlowLayout();
        f = new JFrame();
        f.setLayout(flowLayout);
        f.add(mainForm);
        findResultsButton.addActionListener(this);
        patientDeets.setVisible(false);
        f.setTitle("Corona Cases");
        f.setSize(600, 750);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int date, month, activeA = 0, activeB = 0, activeC = 0, activeD = 0, recoveredA = 0, recoveredB = 0, recoveredC = 0, recoveredD = 0;
        boolean selectA = false, selectB = false, selectC = false, selectD = false;
        ArrayList<Pair<Patient, String>> list = new ArrayList<>();
        if (e.getSource() == findResultsButton) {
            date = Integer.parseInt(DDTextField.getText());
            month = Integer.parseInt(MMTextField.getText());
            if (aCheckBox.isSelected()) {
                selectA = true;
            }
            if (bCheckBox.isSelected()) {
                selectB = true;
            }
            if (cCheckBox.isSelected()) {
                selectC = true;
            }
            if (dCheckBox.isSelected()) {
                selectD = true;
            }
            for (int i = 0; i < 20; i++) {
                GregorianCalendar inputDate = new GregorianCalendar();
                inputDate.set(2020, month - 1, date);
                GregorianCalendar lowerDate = new GregorianCalendar();
                lowerDate.set(2020, patients[i].dateOfReporting.get(GregorianCalendar.MONTH), patients[i].dateOfReporting.get(GregorianCalendar.DATE));
                GregorianCalendar upperDate = new GregorianCalendar();
                upperDate.set(2020, patients[i].dateOfRecovery.get(GregorianCalendar.MONTH), patients[i].dateOfRecovery.get(GregorianCalendar.DATE));
                if (patients[i].tower == 'A') {
                    if (inputDate.compareTo(lowerDate) >= 0) {
                        if (inputDate.compareTo(upperDate) >= 0) {
                            recoveredA++;
                            if (selectA == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Recovered"));
                            }
                        } else {
                            activeA++;
                            if (selectA == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Active"));
                            }
                        }
                    }
                } else if (patients[i].tower == 'B') {
                    if (inputDate.compareTo(lowerDate) >= 0) {
                        if (inputDate.compareTo(upperDate) >= 0) {
                            recoveredB++;
                            if (selectB == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Recovered"));
                            }
                        } else {
                            activeB++;
                            if (selectB == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Active"));
                            }
                        }
                    }
                } else if (patients[i].tower == 'C') {
                    if (inputDate.compareTo(lowerDate) >= 0) {
                        if (inputDate.compareTo(upperDate) >= 0) {
                            recoveredC++;
                            if (selectC == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Recovered"));
                            }
                        } else {
                            activeC++;
                            if (selectC == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Active"));
                            }
                        }
                    }
                } else if (patients[i].tower == 'D') {
                    if (inputDate.compareTo(lowerDate) >= 0) {
                        if (inputDate.compareTo(upperDate) >= 0) {
                            recoveredD++;
                            if (selectD == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Recovered"));
                            }
                        } else {
                            activeD++;
                            if (selectD == true) {
                                list.add(new Pair<Patient, String>(patients[i], "Active"));
                            }
                        }
                    }
                }
            }
            AACases.setText(activeA + "");
            BACases.setText(activeB + "");
            CACases.setText(activeC + "");
            DACases.setText(activeD + "");
            ARCases.setText(recoveredA + "");
            BRCases.setText(recoveredB + "");
            CRCases.setText(recoveredC + "");
            DRCases.setText(recoveredD + "");
            String[] tableRows = {"S.No.", "Name", "Age", "Tower", "Date of Reporting", "Date of Recovery", "Status"};
            tableModel = new DefaultTableModel(tableRows, 0);
            String[] tableRow = new String[7];
            for (int ctr = 0; ctr < list.size(); ctr++) {
                tableRow[0] = (ctr + 1) + "";
                tableRow[1] = (list.get(ctr).getKey().patientName);
                tableRow[2] = (list.get(ctr).getKey().age + "");
                tableRow[3] = (list.get(ctr).getKey().tower + "");
                tableRow[4] = (list.get(ctr).getKey().dateOfReporting.get(GregorianCalendar.DATE) + "/" + (((int)list.get(ctr).getKey().dateOfReporting.get(GregorianCalendar.MONTH)) + 1) + "/" + 2020);
                tableRow[5] = (list.get(ctr).getKey().dateOfRecovery.get(GregorianCalendar.DATE) + "/" + (((int)list.get(ctr).getKey().dateOfRecovery.get(GregorianCalendar.MONTH)) + 1) + "/" + 2020);
                tableRow[6] = (list.get(ctr).getValue());
                tableModel.addRow(tableRow);
            }
            patientDeets.setVisible(true);
            table.setModel(tableModel);
            table.setFillsViewportHeight(false);
            TableColumnModel tableColumnModel = table.getColumnModel();
            tableColumnModel.getColumn(0).setPreferredWidth(40);
            tableColumnModel.getColumn(1).setPreferredWidth(65);
            tableColumnModel.getColumn(2).setPreferredWidth(30);
            tableColumnModel.getColumn(3).setPreferredWidth(40);
            tableColumnModel.getColumn(4).setPreferredWidth(100);
            tableColumnModel.getColumn(5).setPreferredWidth(100);
            tableColumnModel.getColumn(6).setPreferredWidth(75);
            f.add(scrollPane);
            f.setVisible(true);
        }
    }
}

public class labAssignment {
    public static void main(String[] args) {
        CoronaControl corona = new CoronaControl();
    }
}