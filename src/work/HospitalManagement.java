package first;

import java.util.Calendar;
import java.util.Scanner;

public class HospitalManagement
{
    public static void main(String args[])
    {
    	//defining month values according to our preferred date format
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Calendar calendar = Calendar.getInstance();
        
        //count values = 4 for arrays with 4 rows of pre-defined information
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
        
        //Main screen
        System.out.println("");
        System.out.println("\033[0;1m" +"                                    *** BELL HOSPITAL ***"+ "\033[0m");
        System.out.println("----------------------------------------------------------------------------------------");
        
        //date & time
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t                   Time: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        
        //Object definition for Menu
        menu doctors = new menu();
        menu patients = new menu();
        menu meds = new menu();
        menu apps = new menu();
        doctors.setHead1("1. Doctors");
        patients.setHead2("4. Patients");
        meds.setHead3("2. Medicines");
        apps.setHead4("3. Appointments");
        
        //Arrays
        doctor[] d = new doctor[10];
        patient[] p = new patient[10];
        medicine[] m = new medicine[10];
        apps[] s = new apps[10];
        
        int i;
        for (i = 0; i < 10; i++)
            d[i] = new doctor();
        for (i = 0; i < 10; i++)
            p[i] = new patient();
        for (i = 0; i < 10; i++)
            m[i] = new medicine();
        for (i = 0; i < 10; i++)
            s[i] = new apps();

        //Default inputs in arrays
        //Doctors:
        d[0].did = "101";
        d[0].dname = "Dr. Alpha";
        d[0].specialist = "Pediatrics";
        d[0].dno = "0675619229";
        d[1].did = "102";
        d[1].dname = "Dr. Beta";
        d[1].specialist = "Psychiatry";
        d[1].dno = "0432144789";
        d[2].did = "103";
        d[2].dname = "Dr. Gamma";
        d[2].specialist = "Neurosurgery";
        d[2].dno = "0566128754";
        d[3].did = "104";
        d[3].dname = "Dr. Delta";
        d[3].specialist = "Dermatology";
        d[3].dno = "0566128755";

        //Patients:
        p[0].pid = "123456";
        p[0].pname = "Uno";
        p[0].addy = "Ajman";
        p[0].pno = "0501519086";
        p[0].diagnosis = "Fever";
        p[0].age = 30;
        p[1].pid = "133842";
        p[1].pname = "Dos";
        p[1].addy = "Dubai";
        p[1].pno = "0551205021";
        p[1].diagnosis = "TB";
        p[1].age = 23;
        p[2].pid = "141537";
        p[2].pname = "Tres";
        p[2].addy = "Dubai";
        p[2].pno = "0561023440";
        p[2].diagnosis = "N/A";
        p[2].age = 45;
        p[3].pid = "151235";
        p[3].pname = "Quatro";
        p[3].addy = "Sharjah";
        p[3].pno = "0501030542";
        p[3].diagnosis = "HPV";
        p[3].age = 25;

        //Medicines
        m[0].med_name = "Panadol";
        m[0].med_comp = "121";
        m[0].date = "9-11-22";
        m[0].med_cost = 55;
        m[1].med_name = "Clonazepan";
        m[1].med_comp = "135";
        m[1].date = "4-11-22";
        m[1].med_cost = 500;
        m[2].med_name = "Ibuprofen";
        m[2].med_comp = "19";
        m[2].date = "12-05-22";
        m[2].med_cost = 50;
        m[3].med_name = "Cetrizine";
        m[3].med_comp = "111";
        m[3].date = "12-05-22";
        m[3].med_cost = 1100;

        //Appointments
        s[0].sname = "Dasher";
        s[0].docid = "101";
        s[0].symptoms = "Neck pain";
        s[0].sex = "Male";
        s[0].date = "12-10-22";
        s[1].sname = "Dancer";
        s[1].docid = "104";
        s[1].symptoms = "Follow-up";
        s[1].sex = "Female";
        s[1].date = "12-10-22";
        s[2].sname = "Rudolph";
        s[2].docid = "103";
        s[2].symptoms = "Consultation";
        s[2].sex = "Male";
        s[2].date = "13-11-22";
        s[3].sname = "Blitzen";
        s[3].docid = "101";
        s[3].symptoms = "Neck pain";
        s[3].sex = "Female";
        s[3].date = "12-10-22";

        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;  //variables defined for while loops

        try {
        	while (status == 1)
            {
                //Main Menu Heading:
        		System.out.println("\033[0;1m"+"\n                                         MAIN MENU"+ "\033[0m");
        		System.out.println("For Receptionists");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\033[0;1m"+"                          " +doctors.getHead1()+"  "+meds.getHead3()+"  "+apps.getHead4()+ "\033[0m");
                System.out.println("----------------------------------------------------------------------------------------");
                
                System.out.println("For Doctors");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.println("\033[0;1m"+"                                      "+ patients.getHead2()+ "\033[0m");
                System.out.println("----------------------------------------------------------------------------------------");
                System.out.print("\033[0;1m"+"Your choice: "+ "\033[0m");
                choice = input.nextInt();  //user inputs a choice
                
                switch (choice)
                {
                    case 1:
                        {
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("\033[0;1m"+"                                        **DOCTORS**"+ "\033[0m");
                            System.out.println("----------------------------------------------------------------------------------------");
                            s1 = 1;
                            
                            while (s1 == 1)
                            {
                                System.out.println("1. New Doctor\n2. Doctors List\n3. Look up a doctor\n");   //doctor menu options
                                System.out.print("\033[0;1m"+"Your choice: "+ "\033[0m");
                                c1 = input.nextInt();
                                
                                switch (c1)
                                {
                                    case 1:
                                        {
                                            d[count1].new_doctor();count1++;   //calling the new doctor method
                                            break;
                                        }
                                    case 2:
                                        {
                                            System.out.println("-------------------------------------------------------------------------------------------------");
                                            System.out.println("ID \t Name\t       Specialisation     Phone");
                                            System.out.println("-------------------------------------------------------------------------------------------------");
                                            for (j = 0; j < count1; j++)
                                            {
                                                d[j].doctor_info();   //calling the doctor info method
                                                
                                            }
                                            break;
                                        }
                                    case 3:
                                    {
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter the doctor's ID no.: ");
                                    	String a = sc2.next();
                                        for (int lcv2 = 0; lcv2 < d.length; lcv2++)
                                        {
                                        	if (d[lcv2].did == null) {
                                        		System.out.println("Invalid Doctor ID.");
                                            	break;
                                        	}
                                            else if (Integer.parseInt(d[lcv2].did) == Integer.parseInt(a)) {
                                            	System.out.println("-------------------------------------------------------------------------------------------------");
                                                System.out.println("ID \t Name\t        Specialisation \t Phone");
                                                System.out.println("-------------------------------------------------------------------------------------------------");
                                            	d[lcv2].doctor_info();   //calling the doctor infor method for a particular doc
                                            	break;
                                            }
                                            else {
                                            	continue;
                                            }
                                        }
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Please enter a choice between 1 & 3\n");
                                        break;
                                    }
                                    }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s1 = input.nextInt();
                            }
                            break;
                                }
                                
                        
                    case 4:
                        {
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("\033[0;1m"+"                                     **PATIENTS**"+ "\033[0m");
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("This section is for Doctors only. Please enter your credentials to move on");
                            s2 = 1;
                            System.out.print("Enter your Staff ID: ");
                            int doc_verify = input.nextInt();
                            for (int lcv2 = 0; lcv2 < d.length; lcv2++)
                            {
                            	if (d[lcv2].did == null) {
                            		System.out.println("Invalid Doctor ID.");
                            		s2 = 2;
                                	break;
                            	}
                                else if (Integer.parseInt(d[lcv2].did) == doc_verify) {
                                	System.out.println("\nWelcome, "+d[lcv2].dname+"\n");
                                	break;
                                }
                                else {
                                	continue;
                                }
                            }
                            
                            
                            while (s2 == 1)
                            {
                                System.out.println("1. New Patient\n2. Patients List\n3. Look up a patient\n");    //patient menu options
                                System.out.print("\033[0;1m"+"Your choice: "+ "\033[0m");
                                c1 = input.nextInt();
                                switch (c1)
                                {
                                    case 1:
                                        {
                                            p[count2].new_patient();count2++;    //calling the new patient method
                                            break;
                                        }
                                    case 2:
                                        {
                                        	System.out.println("\nInsNo.  Name    Location        Phone                 Diagnosis Age");
                                        	System.out.println("----------------------------------------------------------------------------------------");
                                            for (j = 0; j < count2; j++) {
                                                p[j].patient_info();    //calling the patient info method
                                                
                                            }
                                            break;
                                        }
                                    case 3:
                                    {
                                    	
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter the patient's insurance no.: ");
                                    	String a = sc2.next();
                                        for (int lcv2 = 0; lcv2 < p.length; lcv2++)
                                        {
                                            if (p[lcv2].pid == null) {
                                            	System.out.println("Invalid Patient ID.");
                                            	break;
                                            }
                                            else if (Integer.parseInt(p[lcv2].pid) == Integer.parseInt(a)) {
                                            	System.out.println("\nInsNo.  Name    Location        Phone                 Diagnosis Age");
                                            	System.out.println("----------------------------------------------------------------------------------------");
                                            	p[lcv2].patient_info();    //calling the patient info method for a particular patient
                                            	break;
                                            }
                                            else {
                                            	continue;
                                            }
                                        }
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Please enter a choice between 1 & 3\n");
                                        break;
                                    }
                                    
                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s2 = input.nextInt();
                            }
                            break;
                        }
                    case 2:
                        {
                            s3 = 1;
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("\033[0;1m"+"                                      **MEDICINES**"+ "\033[0m");
                            System.out.println("----------------------------------------------------------------------------------------");
                            while (s3 == 1)
                            {
                                System.out.println("1. New Medicine\n2. Existing Medicines List\n3. Look up a medicine\n4. List all medicines on a particular date\n");   //medicine menu options
                                System.out.print("\033[0;1m"+"Your choice: "+ "\033[0m");
                                c1 = input.nextInt();
                                switch (c1)
                                {
                                    case 1:
                                        {
                                            m[count3].new_medi();count3++;   //calling the new medicine method
                                            break;
                                        }
                                    case 2:
                                        {System.out.println("-----------------------------------------------------------------------------------------");
                                        System.out.println("Name  \t       CompID    Date           Cost");
                                        System.out.println("-----------------------------------------------------------------------------------------");
                                            for (j = 0; j < count3; j++) {
                                                m[j].find_medi();   //calling the medicine info method
                                                
                                            }
                                            break;
                                        }
                                    case 3:
                                    {
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter the medicine comp no.: ");
                                    	String a = sc2.next();
                                        for (int lcv2 = 0; lcv2 < m.length; lcv2++)
                                        {
                                            if (m[lcv2].med_name == null) {
                                            	System.out.println("Invalid medicine.");
                                            	break;
                                            }
                                            else if (Integer.parseInt(m[lcv2].med_comp) == Integer.parseInt(a)) {
                                            	System.out.println("-----------------------------------------------------------------------------------------");
                                                System.out.println("Name  \t       CompID    Date           Cost");
                                                System.out.println("-----------------------------------------------------------------------------------------");
                                            	m[lcv2].find_medi();    //calling the medicine info method for a particular medicine
                                            	break;
                                            }
                                            else {
                                            	continue;
                                            }
                                        }
                                        break;
                                    }
                                    case 4:
                                    {
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter the date: ");
                                    	String a = sc2.next();
                                    	System.out.println("-----------------------------------------------------------------------------------------");
                                        System.out.println("Name  \t       CompID    Date           Cost");
                                        System.out.println("-----------------------------------------------------------------------------------------");
                                        for (int n = 1; n < m.length; n++) {
                                        	if (m[n].date == null) {
                                        		//System.out.println("No medicines on this day.");
                                        		break;
                                        	}
                                        	else if (m[n].date.equals(a)) {
                                        		m[n].find_medi();   //calling the medicine info method for a particular date
                                    		}
                                    		else {
                                            	continue;
                                            }
                                    	}
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Please enter a choice between 1 & 4");
                                        break;
                                    }
                                }
                                
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s3 = input.nextInt();
                            }
                            break;
                        }
                    
                    case 3:
                        {
                            s6 = 1;
                            System.out.println("----------------------------------------------------------------------------------------");
                            System.out.println("\033[0;1m"+"                                    **APPOINTMENTS**"+ "\033[0m");
                            System.out.println("----------------------------------------------------------------------------------------");
                            while (s6 == 1)
                            {
                                System.out.println("1. New Appointment\n2. Appointments list\n3. View appointments for a particular doctor\n4. View appointments on a particular date\n");
                                System.out.print("\033[0;1m"+"Your choice: "+ "\033[0m");
                                c1 = input.nextInt();
                                switch (c1)
                                {
                                    case 1:
                                        {
                                            
                                            s[count6].new_apps();count6++;    //calling the new appointment method
                                            break;
                                        }
                                    case 2:
                                    {
                                    	System.out.println("-------------------------------------------------------------------------------------------------");
                                        System.out.println("PName  DocName  Sex     Date");
                                        System.out.println("-------------------------------------------------------------------------------------------------");
                                        for (j = 0; j < count6; j++) {
                                            s[j].apps_info();   //calling the app info method
                                            
                                        }
                                        break;
                                    }
                                    case 3:
                                    {
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter Doctor ID: ");       
                                    	String a = sc2.next();
                                    	System.out.println("-------------------------------------------------------------------------------------------------");
                                        System.out.println("PName  DocName  Sex     Date");
                                        System.out.println("-------------------------------------------------------------------------------------------------");
                                        for (int n = 0; n < s.length; n++) {
                                        	
                                        	if (s[n].docid == null) {
                                        		System.out.println("No apps for this doctor.");
                                        		break;
                                        		
                                        	}
                                        	else if (s[n].docid.equals(a)) {
                                    			s[n].apps_info();   ///calling the app info method for a particular doc
                                    		}
                                    		else {
                                            	continue;
                                            }
                                    	}
                                        break;
                                    }
                                    case 4:
                                    {
                                    	Scanner sc2 = new Scanner(System.in);
                                    	System.out.print("Enter the date: ");
                                    	String a = sc2.next();
                                    	System.out.println("-------------------------------------------------------------------------------------------------");
                                        System.out.println("PName  DocName  Sex     Date");
                                        System.out.println("-------------------------------------------------------------------------------------------------");

                                        for (int n = 1; n < s.length; n++) {
                                        	if (s[n].date == null) {
                                        		System.out.println("No appointments on this day.");
                                        		break;
                                        	}
                                        	else if (s[n].date.equals(a)) {
                                    			s[n].apps_info();   ///calling the app info method for a particular date
                                    		}
                                    		else {
                                            	continue;
                                            }
                                    	}
                                        break;
                                    }
                                    default:
                                    {
                                        System.out.println("Please enter a choice between 1 & 4");
                                        break;
                                    }

                                }
                                System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                                s6 = input.nextInt();
                            }
                            break;
                        }
                    default:
                        {
                            System.out.println("Please enter a choice between 1 & 4");
                            break;
                        }
                }
                System.out.println("\nReturn to MAIN MENU Press 1");
                status = input.nextInt();
            }
        }
        catch (Exception e) {
        	System.out.println("You have entered an invalid choice. Please run again.");
        	
       }
        
    }
        
}