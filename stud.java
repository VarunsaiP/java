public class stud {
        String usn;
        String name;
        int sem;
        int marks1, marks2, marks3;
    stud() {
            this.usn = "4NI24MC11";
            this.name = "vamshi";
            this.sem = 1;
            this.marks1 =90;
            this.marks2 =87;
            this.marks3 = 85;
        System.out.println("default \n");
        }
        stud(String usn, String name, int sem, int marks1, int marks2, int marks3) {
            this.usn = usn;
            this.name = name;
            this.sem = sem;
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
            System.out.println("parameterised \n");
        }

        double computeAverage() {
            return (marks1 + marks2 + marks3) / 3.0;
        }

        void display() {
            System.out.println("USN :" + usn);
            System.out.println("NAME : " + name);
            System.out.println("Semester : " + sem);
            System.out.println("marks1 :" + marks1 + ", " + marks2 + ", " + marks3);
            System.out.println("Average marks :" + computeAverage());
        }

        public static void main(String[] args) {
            stud stud1 = new stud();
            System.out.println("student 1 details:\n");
            stud1.display();
            System.out.println("parameterised class-->\n");

            stud stud2 = new stud("4NI24MC11111", "rajesh", 2, 85, 90, 88);
            System.out.println("Student 2 details :");
            stud2.display();
        }
    }



