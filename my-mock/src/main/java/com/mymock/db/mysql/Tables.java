/**
 * This class is generated by jOOQ
 */
package com.mymock.db.mysql;


import com.mymock.db.mysql.tables.ColumnsPriv;
import com.mymock.db.mysql.tables.Db;
import com.mymock.db.mysql.tables.EngineCost;
import com.mymock.db.mysql.tables.Event;
import com.mymock.db.mysql.tables.Func;
import com.mymock.db.mysql.tables.GeneralLog;
import com.mymock.db.mysql.tables.GtidExecuted;
import com.mymock.db.mysql.tables.HelpCategory;
import com.mymock.db.mysql.tables.HelpKeyword;
import com.mymock.db.mysql.tables.HelpRelation;
import com.mymock.db.mysql.tables.HelpTopic;
import com.mymock.db.mysql.tables.InnodbIndexStats;
import com.mymock.db.mysql.tables.InnodbTableStats;
import com.mymock.db.mysql.tables.NdbBinlogIndex;
import com.mymock.db.mysql.tables.Plugin;
import com.mymock.db.mysql.tables.Proc;
import com.mymock.db.mysql.tables.ProcsPriv;
import com.mymock.db.mysql.tables.ProxiesPriv;
import com.mymock.db.mysql.tables.ServerCost;
import com.mymock.db.mysql.tables.Servers;
import com.mymock.db.mysql.tables.SlaveMasterInfo;
import com.mymock.db.mysql.tables.SlaveRelayLogInfo;
import com.mymock.db.mysql.tables.SlaveWorkerInfo;
import com.mymock.db.mysql.tables.SlowLog;
import com.mymock.db.mysql.tables.TablesPriv;
import com.mymock.db.mysql.tables.TimeZone;
import com.mymock.db.mysql.tables.TimeZoneLeapSecond;
import com.mymock.db.mysql.tables.TimeZoneName;
import com.mymock.db.mysql.tables.TimeZoneTransition;
import com.mymock.db.mysql.tables.TimeZoneTransitionType;
import com.mymock.db.mysql.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in mysql
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * Column privileges
	 */
	public static final ColumnsPriv COLUMNS_PRIV = com.mymock.db.mysql.tables.ColumnsPriv.COLUMNS_PRIV;

	/**
	 * Database privileges
	 */
	public static final Db DB = com.mymock.db.mysql.tables.Db.DB;

	/**
	 * The table mysql.engine_cost
	 */
	public static final EngineCost ENGINE_COST = com.mymock.db.mysql.tables.EngineCost.ENGINE_COST;

	/**
	 * Events
	 */
	public static final Event EVENT = com.mymock.db.mysql.tables.Event.EVENT;

	/**
	 * User defined functions
	 */
	public static final Func FUNC = com.mymock.db.mysql.tables.Func.FUNC;

	/**
	 * General log
	 */
	public static final GeneralLog GENERAL_LOG = com.mymock.db.mysql.tables.GeneralLog.GENERAL_LOG;

	/**
	 * The table mysql.gtid_executed
	 */
	public static final GtidExecuted GTID_EXECUTED = com.mymock.db.mysql.tables.GtidExecuted.GTID_EXECUTED;

	/**
	 * help categories
	 */
	public static final HelpCategory HELP_CATEGORY = com.mymock.db.mysql.tables.HelpCategory.HELP_CATEGORY;

	/**
	 * help keywords
	 */
	public static final HelpKeyword HELP_KEYWORD = com.mymock.db.mysql.tables.HelpKeyword.HELP_KEYWORD;

	/**
	 * keyword-topic relation
	 */
	public static final HelpRelation HELP_RELATION = com.mymock.db.mysql.tables.HelpRelation.HELP_RELATION;

	/**
	 * help topics
	 */
	public static final HelpTopic HELP_TOPIC = com.mymock.db.mysql.tables.HelpTopic.HELP_TOPIC;

	/**
	 * The table mysql.innodb_index_stats
	 */
	public static final InnodbIndexStats INNODB_INDEX_STATS = com.mymock.db.mysql.tables.InnodbIndexStats.INNODB_INDEX_STATS;

	/**
	 * The table mysql.innodb_table_stats
	 */
	public static final InnodbTableStats INNODB_TABLE_STATS = com.mymock.db.mysql.tables.InnodbTableStats.INNODB_TABLE_STATS;

	/**
	 * The table mysql.ndb_binlog_index
	 */
	public static final NdbBinlogIndex NDB_BINLOG_INDEX = com.mymock.db.mysql.tables.NdbBinlogIndex.NDB_BINLOG_INDEX;

	/**
	 * MySQL plugins
	 */
	public static final Plugin PLUGIN = com.mymock.db.mysql.tables.Plugin.PLUGIN;

	/**
	 * Stored Procedures
	 */
	public static final Proc PROC = com.mymock.db.mysql.tables.Proc.PROC;

	/**
	 * Procedure privileges
	 */
	public static final ProcsPriv PROCS_PRIV = com.mymock.db.mysql.tables.ProcsPriv.PROCS_PRIV;

	/**
	 * User proxy privileges
	 */
	public static final ProxiesPriv PROXIES_PRIV = com.mymock.db.mysql.tables.ProxiesPriv.PROXIES_PRIV;

	/**
	 * MySQL Foreign Servers table
	 */
	public static final Servers SERVERS = com.mymock.db.mysql.tables.Servers.SERVERS;

	/**
	 * The table mysql.server_cost
	 */
	public static final ServerCost SERVER_COST = com.mymock.db.mysql.tables.ServerCost.SERVER_COST;

	/**
	 * Master Information
	 */
	public static final SlaveMasterInfo SLAVE_MASTER_INFO = com.mymock.db.mysql.tables.SlaveMasterInfo.SLAVE_MASTER_INFO;

	/**
	 * Relay Log Information
	 */
	public static final SlaveRelayLogInfo SLAVE_RELAY_LOG_INFO = com.mymock.db.mysql.tables.SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO;

	/**
	 * Worker Information
	 */
	public static final SlaveWorkerInfo SLAVE_WORKER_INFO = com.mymock.db.mysql.tables.SlaveWorkerInfo.SLAVE_WORKER_INFO;

	/**
	 * Slow log
	 */
	public static final SlowLog SLOW_LOG = com.mymock.db.mysql.tables.SlowLog.SLOW_LOG;

	/**
	 * Table privileges
	 */
	public static final TablesPriv TABLES_PRIV = com.mymock.db.mysql.tables.TablesPriv.TABLES_PRIV;

	/**
	 * Time zones
	 */
	public static final TimeZone TIME_ZONE = com.mymock.db.mysql.tables.TimeZone.TIME_ZONE;

	/**
	 * Leap seconds information for time zones
	 */
	public static final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = com.mymock.db.mysql.tables.TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

	/**
	 * Time zone names
	 */
	public static final TimeZoneName TIME_ZONE_NAME = com.mymock.db.mysql.tables.TimeZoneName.TIME_ZONE_NAME;

	/**
	 * Time zone transitions
	 */
	public static final TimeZoneTransition TIME_ZONE_TRANSITION = com.mymock.db.mysql.tables.TimeZoneTransition.TIME_ZONE_TRANSITION;

	/**
	 * Time zone transition types
	 */
	public static final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = com.mymock.db.mysql.tables.TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

	/**
	 * Users and global privileges
	 */
	public static final User USER = com.mymock.db.mysql.tables.User.USER;
}