/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.routines;


import com.mymock.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Returns the value for the requested variable using the following logic:
 *  
 *  1. If the option exists in sys.sys_config return the value from there.
 *  2. Else fall back on the provided default value.
 *  
 *  Notes for using sys_get_config():
 *  
 *  * If the default value argument to sys_get_config() is NULL and case 2. 
 * is reached, NULL is returned.
 *  It is then expected that the caller is able to handle NULL for the given 
 * configuration option.
 *  * The convention is to name the user variables @sys.<name of variable>. 
 * It is <name of variable> that
 *  is stored in the sys_config table and is what is expected as the argument 
 * to sys_get_config().
 *  * If you want to check whether the configuration option has already been 
 * set and if not assign with
 *  the return value of sys_get_config() you can use IFNULL(...) (see example 
 * below). However this should
 *  not be done inside a loop (e.g. for each row in a result set) as for repeated 
 * calls where assignment
 *  is only needed in the first iteration using IFNULL(...) is expected to 
 * be significantly slower than
 *  using an IF (...) THEN ... END IF; block (see example below).
 *  
 *  Parameters
 *  
 *  in_variable_name (VARCHAR(128)):
 *  The name of the config option to return the value for.
 *  
 *  in_default_value (VARCHAR(128)):
 *  The default value to return if neither a use variable exists nor the variable 
 * exists
 *  in sys.sys_config.
 *  
 *  Returns
 *  
 *  VARCHAR(128)
 *  
 *  Example
 *  
 *  mysql> SELECT sys.sys_get_config('statement_truncate_len', 128) AS Value;
 *  +-------+
 *  | Value |
 *  +-------+
 *  | 64    |
 *  +-------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> SET @sys.statement_truncate_len = IFNULL(@sys.statement_truncate_len, 
 * sys.sys_get_config('statement_truncate_len', 64));
 *  Query OK, 0 rows affected (0.00 sec)
 *  
 *  IF (@sys.statement_truncate_len IS NULL) THEN
 *  SET @sys.statement_truncate_len = sys.sys_get_config('statement_truncate_len', 
 * 64);
 *  END IF;
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
public class SysGetConfig extends AbstractRoutine<String> {

	private static final long serialVersionUID = -956864734;

	/**
	 * The parameter <code>sys.sys_get_config.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(128), false);

	/**
	 * The parameter <code>sys.sys_get_config.in_variable_name</code>.
	 */
	public static final Parameter<String> IN_VARIABLE_NAME = createParameter("in_variable_name", org.jooq.impl.SQLDataType.VARCHAR.length(128), false);

	/**
	 * The parameter <code>sys.sys_get_config.in_default_value</code>.
	 */
	public static final Parameter<String> IN_DEFAULT_VALUE = createParameter("in_default_value", org.jooq.impl.SQLDataType.VARCHAR.length(128), false);

	/**
	 * Create a new routine call instance
	 */
	public SysGetConfig() {
		super("sys_get_config", Sys.SYS, org.jooq.impl.SQLDataType.VARCHAR.length(128));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_VARIABLE_NAME);
		addInParameter(IN_DEFAULT_VALUE);
	}

	/**
	 * Set the <code>in_variable_name</code> parameter IN value to the routine
	 */
	public void setInVariableName(String value) {
		setValue(IN_VARIABLE_NAME, value);
	}

	/**
	 * Set the <code>in_variable_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInVariableName(Field<String> field) {
		setField(IN_VARIABLE_NAME, field);
	}

	/**
	 * Set the <code>in_default_value</code> parameter IN value to the routine
	 */
	public void setInDefaultValue(String value) {
		setValue(IN_DEFAULT_VALUE, value);
	}

	/**
	 * Set the <code>in_default_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInDefaultValue(Field<String> field) {
		setField(IN_DEFAULT_VALUE, field);
	}
}
