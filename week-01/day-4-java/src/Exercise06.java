public class Exercise06 {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int workHours = 6;
        int semesterWeeks = 17;
        int weekHours = 52;
        int workingDays = (semesterWeeks * 5);
        float hoursCodeTotal = (workHours * workingDays); //510
        float hoursSemesterTotal = (semesterWeeks * weekHours); // 884
        float percentage = (hoursCodeTotal / hoursSemesterTotal) * 100;


        System.out.println(hoursSemesterTotal);
        System.out.println("Attendee spends by coding " + hoursCodeTotal + " hours during semester");
        System.out.println("Attendee spends by coding " + percentage + "%");


    }


}
