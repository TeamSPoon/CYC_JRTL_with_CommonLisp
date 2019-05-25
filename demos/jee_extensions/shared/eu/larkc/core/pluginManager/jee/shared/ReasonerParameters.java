/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package eu.larkc.core.pluginManager.jee.shared;

import java.io.Serializable;
import eu.larkc.core.data.SetOfStatements;
import eu.larkc.core.query.SPARQLQuery;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

/**
 * Wrapper for the parameters to a reasoner.
 * 
 * @author Barry Bishop
 */
public class ReasonerParameters implements Serializable {
	
	/**
	 * Instantiates new reasoner parameters.
	 * 
	 * @param query the query
	 * @param statements the statements
	 * @param contract the contract
	 * @param context the context
	 */
	public ReasonerParameters( SPARQLQuery query, SetOfStatements statements, Contract contract, Context context ) {
		mQuery = query;
		mStatements = statements;
		mContract = contract;
		mContext = context;
	}
	
	/**
	 * Gets the query.
	 * 
	 * @return the query
	 */
	public SPARQLQuery getQuery() {
    	return mQuery;
    }

	/**
	 * Sets the query.
	 * 
	 * @param query the new query
	 */
	public void setQuery( SPARQLQuery query ) {
    	mQuery = query;
    }

	/**
	 * Gets the statements.
	 * 
	 * @return the statements
	 */
	public SetOfStatements getStatements() {
    	return mStatements;
    }

	/**
	 * Sets the statements.
	 * 
	 * @param statements the new statements
	 */
	public void setStatements( SetOfStatements statements ) {
    	mStatements = statements;
    }

	/**
	 * Gets the contract.
	 * 
	 * @return the contract
	 */
	public Contract getContract() {
    	return mContract;
    }

	/**
	 * Sets the contract.
	 * 
	 * @param contract the new contract
	 */
	public void setContract( Contract contract ) {
    	mContract = contract;
    }

	/**
	 * Gets the context.
	 * 
	 * @return the context
	 */
	public Context getContext() {
    	return mContext;
    }

	/**
	 * Sets the context.
	 * 
	 * @param context the new context
	 */
	public void setContext( Context context ) {
    	mContext = context;
    }

	private SPARQLQuery mQuery;
	private SetOfStatements mStatements;
	private Contract mContract;
	private Context mContext;
    private static final long serialVersionUID = 1L;
}