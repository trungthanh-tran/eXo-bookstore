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
package org.exoplatform.bookstore.impl;

import java.util.List;

import org.exoplatform.bookstore.BookStoreService;
import org.exoplatform.bookstore.entity.BOOK_CATEGORY;
import org.exoplatform.bookstore.entity.Book;
import org.exoplatform.bookstore.exception.BookExistedException;
import org.exoplatform.bookstore.exception.BookNotExistedException;
import org.exoplatform.bookstore.exception.IllegalCategorydException;
import org.picocontainer.Startable;

/**
 * Created by The eXo Platform SAS
 * Author : TRAN Trung Thanh
 *          ttthanh@exoplatform.com
 * May 30, 2012  
 */
public class BookStoreServiceImpl implements BookStoreService, Startable {

  public void start() {
    // TODO Auto-generated method stub

  }

  public void stop() {
    // TODO Auto-generated method stub

  }

  public List<Book> getAllBooks() {
    // TODO Auto-generated method stub
    return null;
  }

  public Book getBookByID() throws BookNotExistedException {
    // TODO Auto-generated method stub
    return null;
  }

  public Book getBookByTitle() {
    // TODO Auto-generated method stub
    return null;
  }

  public Book getBookByID(String ID) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return null;
  }

  public List<Book> getBookByTitle(String title) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return null;
  }

  public boolean deleteBookByID(String ID) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean deleteBookByTitle(String title) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean addBook(Book newbook) throws BookExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean addBook(String bookTitle, String bookSummary, int bookPrice, BOOK_CATEGORY category) throws BookExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean modifyBookTitle(String bookID, String newTitle) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean modifyBookSummary(String bookID, String newBookSummary) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean modifyBookPrice(String bookID, int newBookPrice) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public boolean modifyBookCategory(String bookID, BOOK_CATEGORY newCategory) throws BookNotExistedException {
    // TODO Auto-generated method stub
    return false;
  }

  public List<Book> getBookByCategory(BOOK_CATEGORY categoryName) throws IllegalCategorydException {
    // TODO Auto-generated method stub
    return null;
  }

}
