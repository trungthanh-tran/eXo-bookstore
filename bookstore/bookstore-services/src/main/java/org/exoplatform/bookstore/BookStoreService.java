/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.bookstore;

import java.util.List;

import org.exoplatform.bookstore.entity.Book;
import org.exoplatform.bookstore.entity.BOOK_CATEGORY;
import org.exoplatform.bookstore.exception.BookExistedException;
import org.exoplatform.bookstore.exception.BookNotExistedException;
import org.exoplatform.bookstore.exception.IllegalCategorydException;
import org.exoplatform.bookstore.exception.EmptyBookStoreException;

/**
 * Created by The eXo Platform SAS
 * Author : TRAN Trung Thanh
 *          ttthanh@exoplatform.com
 * May 30, 2012  
 */
public interface BookStoreService{
  /**
   * Get all books in bookstore
   * 
   * @return: List of all books
   */
  public List<Book> getAllBooks() throws EmptyBookStoreException;
  
  /**
   * Get all books by ID
   * 
   * @param ID: Book ID will be gotten
   * @return corresponded Book
   * @throws BookNotExistedException
   */
  public Book getBookByID(String ID)throws BookNotExistedException;
  
  /**
   * Get all books with a specified title
   * 
   * @param title: Title will be gotten
   * @return List of Book
   * @throws BookNotExistedException
   */
  public List<Book> getBookByTitle(String title) throws BookNotExistedException;
  
  /**
   * Delete book by ID
   * 
   * @param ID: Book ID will be deleted
   * @return
   * @throws BookNotExistedException
   */
  
  public boolean deleteBookByID(String ID) throws BookNotExistedException;
  
  /**
   * Get Book by Category 
   *
   * @param categoryName
   * @return list of book having a specified category
   * @throws IllegalCategorydException: If category is illegal
   */
  
  public List<Book> getBookByCategory(BOOK_CATEGORY categoryName) throws IllegalCategorydException;
  
  /**
   * Delete book by Title
   * 
   * @param title: Book title will be deleted
   * @return true if success
   * @return false if fail
   * @throws BookNotExistedException
   */
  
  public boolean deleteBookByTitle(String title) throws BookNotExistedException;
  
  /**
   * Add book
   * 
   * @param newbook: New book will be added
   * @return true if success
   * @return false if fail
   * @throws BookExistedException: If book is existed
   */
  public boolean addBook(Book newbook) throws BookExistedException;
  
  /**
   * Add book by detail
   * 
   * @param bookTitle
   * @param bookSummary
   * @param bookPrice
   * @param category
   * @return true if success
   * @return false if fail
   * @throws BookExistedException: If book is existed
   */
  public boolean addBook (String bookTitle, String bookSummary, int bookPrice, BOOK_CATEGORY category ) throws BookExistedException;
  
  /**
   * Modify book's title
   * 
   * @param bookID
   * @param newTitle
   * @return true if success
   * @return false if fail
   * @throws BookNotExistedException: If book isn't existed
   */
  public boolean modifyBookTitle(String bookID, String newTitle)throws BookNotExistedException;
  
  /**
   * Modify book's summary
   * 
   * @param bookID
   * @param newBookSummary
   * @return true if success
   * @return false if fail
   * @throws BookNotExistedException: If book isn't existed
   */
  public boolean modifyBookSummary (String bookID, String newBookSummary) throws BookNotExistedException;
  
  /**
   * Modify book's price
   * 
   * @param bookID
   * @param newBookPrice
   * @return true if success
   * @return false if fail
   * @throws BookNotExistedException: If book isn't existed
   */
  public boolean modifyBookPrice (String bookID, int newBookPrice) throws BookNotExistedException;
  
  /**
   * Modify book's category
   * 
   * @param bookID
   * @param newCategory
   * @return true if success
   * @return false if fail
   * @throws BookNotExistedException: If book isn't existed
   */
  public boolean modifyBookCategory (String bookID, BOOK_CATEGORY newCategory) throws BookNotExistedException;
  
}
