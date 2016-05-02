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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mysql extends SchemaImpl {

	private static final long serialVersionUID = 1273439228;

	/**
	 * The reference instance of <code>mysql</code>
	 */
	public static final Mysql MYSQL = new Mysql();

	/**
	 * No further instances allowed
	 */
	private Mysql() {
		super("mysql");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			ColumnsPriv.COLUMNS_PRIV,
			Db.DB,
			EngineCost.ENGINE_COST,
			Event.EVENT,
			Func.FUNC,
			GeneralLog.GENERAL_LOG,
			GtidExecuted.GTID_EXECUTED,
			HelpCategory.HELP_CATEGORY,
			HelpKeyword.HELP_KEYWORD,
			HelpRelation.HELP_RELATION,
			HelpTopic.HELP_TOPIC,
			InnodbIndexStats.INNODB_INDEX_STATS,
			InnodbTableStats.INNODB_TABLE_STATS,
			NdbBinlogIndex.NDB_BINLOG_INDEX,
			Plugin.PLUGIN,
			Proc.PROC,
			ProcsPriv.PROCS_PRIV,
			ProxiesPriv.PROXIES_PRIV,
			Servers.SERVERS,
			ServerCost.SERVER_COST,
			SlaveMasterInfo.SLAVE_MASTER_INFO,
			SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO,
			SlaveWorkerInfo.SLAVE_WORKER_INFO,
			SlowLog.SLOW_LOG,
			TablesPriv.TABLES_PRIV,
			TimeZone.TIME_ZONE,
			TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND,
			TimeZoneName.TIME_ZONE_NAME,
			TimeZoneTransition.TIME_ZONE_TRANSITION,
			TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE,
			User.USER);
	}
}