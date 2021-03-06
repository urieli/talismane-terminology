///////////////////////////////////////////////////////////////////////////////
//Copyright (C) 2014 Joliciel Informatique
//
//This file is part of Talismane.
//
//Talismane is free software: you can redistribute it and/or modify
//it under the terms of the GNU Affero General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//Talismane is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU Affero General Public License for more details.
//
//You should have received a copy of the GNU Affero General Public License
//along with Talismane.  If not, see <http://www.gnu.org/licenses/>.
//////////////////////////////////////////////////////////////////////////////
package com.joliciel.talismane.terminology;

/**
 * A single sentence found in a given corpus, and containing terms.
 * @author Assaf Urieli
 *
 */
public interface Context {
  boolean isNew();
  
  public String getFileName();
  public int getColumnNumber();
  public int getLineNumber();
  
  public int getEndLineNumber();
  public void setEndLineNumber(int endLineNumber);

  public int getEndColumnNumber();
  public void setEndColumnNumber(int endColumnNumber);

  public String getTextSegment();
  public void setTextSegment(String textSegment);
  
  public Term getTerm();
  public void setTerm(Term term);
  
  public void save();
}
