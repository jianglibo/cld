/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.routines;


import com.mymock.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Shows all currently disabled instruments.
 *  
 *  Parameters
 *  
 *  None
 *  
 *  Example
 *  
 *  mysql> CALL sys.ps_setup_show_disabled_instruments();
 *  
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowDisabledInstruments extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -448739141;

	/**
	 * Create a new routine call instance
	 */
	public PsSetupShowDisabledInstruments() {
		super("ps_setup_show_disabled_instruments", Sys.SYS);
	}
}
