/*
 *  Name: Chelsea Penner
 *  Program: 
 *  Date Created: 8-Mar-2019
 *  Date Modified: 8-Mar-2019
 *  Student Number: 991 350 908
 *  Description: 
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *
 * @author Chelsea Penner
 */
public class TestUserProfile {
    
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in); //initalize scanner
        UserProfile user = new UserProfile("", ""); //no user information yet
        
            //prompt user to input the name they wish to use
        System.out.println("Please enter the username you wish to use:");
        String username = scan.next(); //get username from user input
            //prompt user to input their favourite genre
        System.out.println("Please enter your favourite movie genre "
                + "(Comedy, Drama, Action, Mystery):");
        String genre = scan.next(); //get genre choice from user input
        
        user.setUserID(username); //set the userID from input
        user.setGenre(genre); //set the genre for user from input
        
            //print final statement with user information
        System.out.println("Your profile has been created! Your username is " 
                + user.getUserID() + " and your favourite movie genre is " 
                + user.getGenre() + "!");
    }
}
