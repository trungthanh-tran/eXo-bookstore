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
package org.exoplatform.bookstore.entity;

/**
 * Created by The eXo Platform SAS
 * Author : TRAN Trung Thanh
 *          ttthanh@exoplatform.com
 * May 30, 2012  
 */

/*
 * Book: Book description
 * String bookID: ID of book, it's unique for each book
 * String bookName: Name of book
 * ArrayList<String> author: Book Authors
 * String bookContent: book content
 * int publishedYear: Year when book is published
 * int bookPrice: book price 
 * BOOK_CATEGORY category: Book category
 */
public class Book {
  
  private String bookId;

  private String bookName;

  private String bookSummary;
  
  private int bookPrice;
  
  private BOOK_CATEGORY category; 
  
  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public int getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(int bookPrice) {
    this.bookPrice = bookPrice;
  }

  public BOOK_CATEGORY getCategory() {
    return category;
  }

  public void setCategory(BOOK_CATEGORY category) {
    this.category = category;
  }


  public String getBookSummary() {
    return bookSummary;
  }

  public void setBookSummary(String bookSummary) {
    this.bookSummary = bookSummary;
  }
  
}