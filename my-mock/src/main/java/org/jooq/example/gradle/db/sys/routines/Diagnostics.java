/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Create a report of the current status of the server for diagnostics purposes. 
 * Data collected includes (some items depends on versions and settings):
 *  
 *  * The GLOBAL VARIABLES
 *  * Several sys schema views including metrics or equivalent (depending 
 * on version and settings)
 *  * Queries in the 95th percentile
 *  * Several ndbinfo views for MySQL Cluster
 *  * Replication (both master and slave) information.
 *  
 *  Some of the sys schema views are calculated as initial (optional), overall, 
 * delta:
 *  
 *  * The initial view is the content of the view at the start of this procedure.
 *  This output will be the same as the the start values used for the delta 
 * view.
 *  The initial view is included if @sys.diagnostics.include_raw = 'ON'.
 *  * The overall view is the content of the view at the end of this procedure.
 *  This output is the same as the end values used for the delta view.
 *  The overall view is always included.
 *  * The delta view is the difference from the beginning to the end. Note 
 * that for min and max values
 *  they are simply the min or max value from the end view respectively, so 
 * does not necessarily reflect
 *  the minimum/maximum value in the monitored period.
 *  Note: except for the metrics views the delta is only calculation between 
 * the first and last outputs.
 *  
 *  Requires the SUPER privilege for "SET sql_log_bin = 0;".
 *  
 *  Versions supported:
 *  * MySQL 5.6: 5.6.10 and later
 *  * MySQL 5.7: 5.7.9 and later
 *  
 *  Parameters
 *  
 *  in_max_runtime (INT UNSIGNED):
 *  The maximum time to keep collecting data.
 *  Use NULL to get the default which is 60 seconds, otherwise enter a value 
 * greater than 0.
 *  in_interval (INT UNSIGNED):
 *  How long to sleep between data collections.
 *  Use NULL to get the default which is 30 seconds, otherwise enter a value 
 * greater than 0.
 *  in_auto_config (ENUM('current', 'medium', 'full'))
 *  Automatically enable Performance Schema instruments and consumers.
 *  NOTE: The more that are enabled, the more impact on the performance.
 *  Supported values are:
 *  * current - use the current settings.
 *  * medium - enable some settings. This requires the SUPER privilege.
 *  * full - enables all settings. This will have a big impact on the
 *  performance - be careful using this option. This requires
 *  the SUPER privilege.
 *  If another setting the 'current' is chosen, the current settings
 *  are restored at the end of the procedure.
 *  
 *  
 *  Configuration Options
 *  
 *  sys.diagnostics.allow_i_s_tables
 *  Specifies whether it is allowed to do table scan queries on information_schema.TABLES. 
 * This can be expensive if there
 *  are many tables. Set to 'ON' to allow, 'OFF' to not allow.
 *  Default is 'OFF'.
 *  
 *  sys.diagnostics.include_raw
 *  Set to 'ON' to include the raw data (e.g. the original output of "SELECT 
 * * FROM sys.metrics").
 *  Use this to get the initial values of the various views.
 *  Default is 'OFF'.
 *  
 *  sys.statement_truncate_len
 *  How much of queries in the process list output to include.
 *  Default is 64.
 *  
 *  sys.debug
 *  Whether to provide debugging output.
 *  Default is 'OFF'. Set to 'ON' to include.
 *  
 *  
 *  Example
 *  
 *  To create a report and append it to the file diag.out:
 *  
 *  mysql> TEE diag.out;
 *  mysql> CALL sys.diagnostics(120, 30, 'current');
 *  ...
 *  mysql> NOTEE;
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
public class Diagnostics extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 749332528;

	/**
	 * The parameter <code>sys.diagnostics.in_max_runtime</code>.
	 */
	public static final Parameter<Integer> IN_MAX_RUNTIME = createParameter("in_max_runtime", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>sys.diagnostics.in_interval</code>.
	 */
	public static final Parameter<Integer> IN_INTERVAL = createParameter("in_interval", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>sys.diagnostics.in_auto_config</code>.
	 */
	public static final Parameter<String> IN_AUTO_CONFIG = createParameter("in_auto_config", org.jooq.impl.SQLDataType.VARCHAR.length(7), false);

	/**
	 * Create a new routine call instance
	 */
	public Diagnostics() {
		super("diagnostics", Sys.SYS);

		addInParameter(IN_MAX_RUNTIME);
		addInParameter(IN_INTERVAL);
		addInParameter(IN_AUTO_CONFIG);
	}

	/**
	 * Set the <code>in_max_runtime</code> parameter IN value to the routine
	 */
	public void setInMaxRuntime(Integer value) {
		setValue(IN_MAX_RUNTIME, value);
	}

	/**
	 * Set the <code>in_interval</code> parameter IN value to the routine
	 */
	public void setInInterval(Integer value) {
		setValue(IN_INTERVAL, value);
	}

	/**
	 * Set the <code>in_auto_config</code> parameter IN value to the routine
	 */
	public void setInAutoConfig(String value) {
		setValue(IN_AUTO_CONFIG, value);
	}
}
