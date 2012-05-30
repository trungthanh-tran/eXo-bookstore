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
package org.exoplatform.bookstore.utils;

import org.exoplatform.bookstore.entity.BOOK_CATEGORY;

/**
 * Created by The eXo Platform SAS
 * Author : TRAN Trung Thanh
 *          ttthanh@exoplatform.com
 * May 30, 2012
 * 
 * Get category name by CategoryID
 */
public final class Utils {
  public static String getNameByBookCategory (BOOK_CATEGORY category)
  {
    switch (category){
      case NOVEL: 
        return "Novel";
      case MANGA: 
        return "Manga";
      case COMICS:
        return "Comics";
      case TECHNICAL:
        return "Technical";
      case MATHS:
        return "Mathmatical";
      case HISTORY:
        return "History";
      default:
        return "Unknown";
    }
  }
}
