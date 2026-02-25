package com.defaultSize;

public class Library {

    static String bookTitle = "JAVA Programming";
    static String authorName;
    static int bookId = 001;
    static boolean isIssued;
    static int totalPages;

    public static void main(String[] args) {

        System.out.println("Library Book Information");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Total Pages: " + totalPages);
        System.out.println("Book Issued Status: " + isIssued);
    }
}