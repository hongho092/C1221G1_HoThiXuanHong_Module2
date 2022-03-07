package collection_review;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class PersonController {

    public static void PersonCommon () {
        Experience experience = new Experience();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManager personManager = new PersonManager();

        boolean out = false;
        while (!out) { // chạy cho đến khi nào khác out thì sẽ không chạy nữa.
            System.out.print("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1.\tExperience\n" +
                    "2.\tFresher\n" +
                    "3.\tInternship\n" +
                    "4.\tSearching\n" +
                    "5.\tExit\n" +
                    " (Please choose 1 to Create Experience Candidate, " +
                    "2 to Create Fresher Candidate, " +
                    "3 to Internship Candidate, " +
                    "4 to Searching and 5 to Exit program).\n" +
                    "Your choice ---> ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String ans;
                    do {
                        Experience experience = new Experience();
                        System.out.println("We will start to create Experience Candidate.\n" +
                                "Enter id, firstName, lastName, birthDate, address, phone, email, candidate, expInYear, proSkill: ");
                        experience.setId(Integer.parseInt(scanner.nextLine()));
                        experience.setFirstName(scanner.nextLine());
                        experience.setLastName(scanner.nextLine());
                        experience.setBirthDate(Integer.parseInt(scanner.nextLine()));
                        experience.setAddress(scanner.nextLine());
                        experience.setPhone(Integer.parseInt(scanner.nextLine()));
                        experience.setEmail(scanner.nextLine());
                        experience.setCandidate(Integer.parseInt(scanner.nextLine()));
                        experience.setExpInYear(Integer.parseInt(scanner.nextLine()));
                        experience.setProSkill(scanner.nextLine());
                        personManager.addExperience(experience);
                        System.out.print("Do you want to continue? (y=yes) -> ");
                        ans = scanner.nextLine();
                    } while (ans.equals("y"));
                    personManager.showExperience();
                    out = false;
                    break;
                case 2:
                    do {
                        Fresher fresher = new Fresher();
                        System.out.println("We will start to create Fresher Candidate.\n" +
                                "Enter id, firstName, lastName, birthDate, address, phone, email, candidate, graduationDate, graduationRank, education: ");
                        fresher.setId(Integer.parseInt(scanner.nextLine()));
                        fresher.setFirstName(scanner.nextLine());
                        fresher.setLastName(scanner.nextLine());
                        fresher.setBirthDate(Integer.parseInt(scanner.nextLine()));
                        fresher.setAddress(scanner.nextLine());
                        fresher.setPhone(Integer.parseInt(scanner.nextLine()));
                        fresher.setEmail(scanner.nextLine());
                        fresher.setCandidate(Integer.parseInt(scanner.nextLine()));
                        fresher.setGraduationDate(Integer.parseInt(scanner.nextLine()));
                        fresher.setGraduationRank(scanner.nextLine());
                        fresher.setEducation(scanner.nextLine());
                        personManager.addFresher(fresher);
                        System.out.print("Do you want to continue? (y=yes) -> ");
                        ans = scanner.nextLine();
                    } while (ans.equals("y"));
                    personManager.showFresher();
                    out = false;
                    break;
                case 3:
                    do {
                        Intern intern = new Intern();
                        System.out.println("We will start to create Internship Candidate.\n" +
                                "Enter id, firstName, lastName, birthDate, address, phone, email, candidate, majors, semester, universityName: ");
                        intern.setId(Integer.parseInt(scanner.nextLine()));
                        intern.setFirstName(scanner.nextLine());
                        intern.setLastName(scanner.nextLine());
                        intern.setBirthDate(Integer.parseInt(scanner.nextLine()));
                        intern.setAddress(scanner.nextLine());
                        intern.setPhone(Integer.parseInt(scanner.nextLine()));
                        intern.setEmail(scanner.nextLine());
                        intern.setCandidate(Integer.parseInt(scanner.nextLine()));
                        intern.setMajors(scanner.nextLine());
                        intern.setSemester(scanner.nextLine());
                        intern.setUniversityName(scanner.nextLine());
                        personManager.addIntern(intern);
                        System.out.print("Do you want to continue? (y=yes) -> ");
                        ans = scanner.nextLine();
                    } while (ans.equals("y"));
                    personManager.showIntern();
                    out = false;
                    break;
                case 4:
                    System.out.print("Which candidate's list do you want to display?\n" +
                            "1.\tExperience\n" +
                            "2.\tFresher\n" +
                            "3.\tInternship \n" +
                            "\t\b--> ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1) {
                        case 1:
                            System.out.print("Enter name of Experience -> ");
                            String name1 = scanner.nextLine();
                            for (int i=0; i<personManager.getExperiences().size(); i++) {
                                String fullName = personManager.getExperiences().get(i).getFirstName() + " " +
                                        personManager.getExperiences().get(i).getLastName();
                                if (fullName.contains(name1)) {
                                    System.out.println(personManager.getExperiences().get(i));
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Enter name of Fresher -> ");
                            String name2 = scanner.nextLine();
                            for (int i=0; i<personManager.getFreshers().size(); i++) {
                                String fullName = personManager.getFreshers().get(i).getFirstName() + " " +
                                        personManager.getFreshers().get(i).getLastName();
                                if (fullName.contains(name2)) {
                                    System.out.println(personManager.getFreshers().get(i));
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Enter name of Internship -> ");
                            String name3 = scanner.nextLine();
                            for (int i=0; i<personManager.getInterns().size(); i++) {
                                String fullName = personManager.getInterns().get(i).getFirstName() + " " +
                                        personManager.getInterns().get(i).getLastName();
                                if (fullName.contains(name3)) {
                                    System.out.println(personManager.getInterns().get(i));
                                }
                            }
                            break;
                        default:
                            System.out.println("No choice!!!");
                    }
                    out = false;
                    break;
                default:
                    System.out.println("We are done!!!");
                    out = true;
            }
        }

    }
}
