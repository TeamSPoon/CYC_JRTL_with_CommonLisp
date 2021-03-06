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
import eu.larkc.core.data.InformationSet;
import eu.larkc.plugin.Context;
import eu.larkc.plugin.Contract;

/**
 * Wrapper for the parameters to a data transformer.
 * 
 * @author Barry Bishop
 */
public class DataTransformerParameters implements Serializable {
	
	/**
	 * Instantiates new data transformer parameters.
	 * 
	 * @param informationSet the information set
	 * @param contract the contract
	 * @param context the context
	 */
	public DataTransformerParameters( InformationSet informationSet, Contract contract, Context context ) {
		mInformationSet = informationSet;
		mContract = contract;
		mContext = context;
	}
	
	/**
	 * Gets the information set.
	 * 
	 * @return the information set
	 */
	public InformationSet getInformationSet() {
    	return mInformationSet;
    }

	/**
	 * Sets the information set.
	 * 
	 * @param informationSet the new information set
	 */
	public void setInformationSet( InformationSet informationSet ) {
    	this.mInformationSet = informationSet;
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
	 * @param mContract the new contract
	 */
	public void setContract( Contract mContract ) {
    	this.mContract = mContract;
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
	 * @param mContext the new context
	 */
	public void setContext( Context mContext ) {
    	this.mContext = mContext;
    }

	private InformationSet mInformationSet;
	private Contract mContract;
	private Context mContext;
    private static final long serialVersionUID = 1L;
}