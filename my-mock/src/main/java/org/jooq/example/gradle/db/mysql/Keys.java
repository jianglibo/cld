/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.mysql;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.example.gradle.db.mysql.tables.ColumnsPriv;
import org.jooq.example.gradle.db.mysql.tables.Db;
import org.jooq.example.gradle.db.mysql.tables.EngineCost;
import org.jooq.example.gradle.db.mysql.tables.Event;
import org.jooq.example.gradle.db.mysql.tables.Func;
import org.jooq.example.gradle.db.mysql.tables.GtidExecuted;
import org.jooq.example.gradle.db.mysql.tables.HelpCategory;
import org.jooq.example.gradle.db.mysql.tables.HelpKeyword;
import org.jooq.example.gradle.db.mysql.tables.HelpRelation;
import org.jooq.example.gradle.db.mysql.tables.HelpTopic;
import org.jooq.example.gradle.db.mysql.tables.InnodbIndexStats;
import org.jooq.example.gradle.db.mysql.tables.InnodbTableStats;
import org.jooq.example.gradle.db.mysql.tables.NdbBinlogIndex;
import org.jooq.example.gradle.db.mysql.tables.Plugin;
import org.jooq.example.gradle.db.mysql.tables.Proc;
import org.jooq.example.gradle.db.mysql.tables.ProcsPriv;
import org.jooq.example.gradle.db.mysql.tables.ProxiesPriv;
import org.jooq.example.gradle.db.mysql.tables.ServerCost;
import org.jooq.example.gradle.db.mysql.tables.Servers;
import org.jooq.example.gradle.db.mysql.tables.SlaveMasterInfo;
import org.jooq.example.gradle.db.mysql.tables.SlaveRelayLogInfo;
import org.jooq.example.gradle.db.mysql.tables.SlaveWorkerInfo;
import org.jooq.example.gradle.db.mysql.tables.TablesPriv;
import org.jooq.example.gradle.db.mysql.tables.TimeZone;
import org.jooq.example.gradle.db.mysql.tables.TimeZoneLeapSecond;
import org.jooq.example.gradle.db.mysql.tables.TimeZoneName;
import org.jooq.example.gradle.db.mysql.tables.TimeZoneTransition;
import org.jooq.example.gradle.db.mysql.tables.TimeZoneTransitionType;
import org.jooq.example.gradle.db.mysql.tables.User;
import org.jooq.example.gradle.db.mysql.tables.records.ColumnsPrivRecord;
import org.jooq.example.gradle.db.mysql.tables.records.DbRecord;
import org.jooq.example.gradle.db.mysql.tables.records.EngineCostRecord;
import org.jooq.example.gradle.db.mysql.tables.records.EventRecord;
import org.jooq.example.gradle.db.mysql.tables.records.FuncRecord;
import org.jooq.example.gradle.db.mysql.tables.records.GtidExecutedRecord;
import org.jooq.example.gradle.db.mysql.tables.records.HelpCategoryRecord;
import org.jooq.example.gradle.db.mysql.tables.records.HelpKeywordRecord;
import org.jooq.example.gradle.db.mysql.tables.records.HelpRelationRecord;
import org.jooq.example.gradle.db.mysql.tables.records.HelpTopicRecord;
import org.jooq.example.gradle.db.mysql.tables.records.InnodbIndexStatsRecord;
import org.jooq.example.gradle.db.mysql.tables.records.InnodbTableStatsRecord;
import org.jooq.example.gradle.db.mysql.tables.records.NdbBinlogIndexRecord;
import org.jooq.example.gradle.db.mysql.tables.records.PluginRecord;
import org.jooq.example.gradle.db.mysql.tables.records.ProcRecord;
import org.jooq.example.gradle.db.mysql.tables.records.ProcsPrivRecord;
import org.jooq.example.gradle.db.mysql.tables.records.ProxiesPrivRecord;
import org.jooq.example.gradle.db.mysql.tables.records.ServerCostRecord;
import org.jooq.example.gradle.db.mysql.tables.records.ServersRecord;
import org.jooq.example.gradle.db.mysql.tables.records.SlaveMasterInfoRecord;
import org.jooq.example.gradle.db.mysql.tables.records.SlaveRelayLogInfoRecord;
import org.jooq.example.gradle.db.mysql.tables.records.SlaveWorkerInfoRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TablesPrivRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneLeapSecondRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneNameRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneTransitionRecord;
import org.jooq.example.gradle.db.mysql.tables.records.TimeZoneTransitionTypeRecord;
import org.jooq.example.gradle.db.mysql.tables.records.UserRecord;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships between tables of the <code>mysql</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<TimeZoneRecord, UInteger> IDENTITY_TIME_ZONE = Identities0.IDENTITY_TIME_ZONE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = UniqueKeys0.KEY_COLUMNS_PRIV_PRIMARY;
	public static final UniqueKey<DbRecord> KEY_DB_PRIMARY = UniqueKeys0.KEY_DB_PRIMARY;
	public static final UniqueKey<EngineCostRecord> KEY_ENGINE_COST_PRIMARY = UniqueKeys0.KEY_ENGINE_COST_PRIMARY;
	public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = UniqueKeys0.KEY_EVENT_PRIMARY;
	public static final UniqueKey<FuncRecord> KEY_FUNC_PRIMARY = UniqueKeys0.KEY_FUNC_PRIMARY;
	public static final UniqueKey<GtidExecutedRecord> KEY_GTID_EXECUTED_PRIMARY = UniqueKeys0.KEY_GTID_EXECUTED_PRIMARY;
	public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = UniqueKeys0.KEY_HELP_CATEGORY_PRIMARY;
	public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = UniqueKeys0.KEY_HELP_CATEGORY_NAME;
	public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = UniqueKeys0.KEY_HELP_KEYWORD_PRIMARY;
	public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = UniqueKeys0.KEY_HELP_KEYWORD_NAME;
	public static final UniqueKey<HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = UniqueKeys0.KEY_HELP_RELATION_PRIMARY;
	public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = UniqueKeys0.KEY_HELP_TOPIC_PRIMARY;
	public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_NAME = UniqueKeys0.KEY_HELP_TOPIC_NAME;
	public static final UniqueKey<InnodbIndexStatsRecord> KEY_INNODB_INDEX_STATS_PRIMARY = UniqueKeys0.KEY_INNODB_INDEX_STATS_PRIMARY;
	public static final UniqueKey<InnodbTableStatsRecord> KEY_INNODB_TABLE_STATS_PRIMARY = UniqueKeys0.KEY_INNODB_TABLE_STATS_PRIMARY;
	public static final UniqueKey<NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = UniqueKeys0.KEY_NDB_BINLOG_INDEX_PRIMARY;
	public static final UniqueKey<PluginRecord> KEY_PLUGIN_PRIMARY = UniqueKeys0.KEY_PLUGIN_PRIMARY;
	public static final UniqueKey<ProcRecord> KEY_PROC_PRIMARY = UniqueKeys0.KEY_PROC_PRIMARY;
	public static final UniqueKey<ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = UniqueKeys0.KEY_PROCS_PRIV_PRIMARY;
	public static final UniqueKey<ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = UniqueKeys0.KEY_PROXIES_PRIV_PRIMARY;
	public static final UniqueKey<ServersRecord> KEY_SERVERS_PRIMARY = UniqueKeys0.KEY_SERVERS_PRIMARY;
	public static final UniqueKey<ServerCostRecord> KEY_SERVER_COST_PRIMARY = UniqueKeys0.KEY_SERVER_COST_PRIMARY;
	public static final UniqueKey<SlaveMasterInfoRecord> KEY_SLAVE_MASTER_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_MASTER_INFO_PRIMARY;
	public static final UniqueKey<SlaveRelayLogInfoRecord> KEY_SLAVE_RELAY_LOG_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_RELAY_LOG_INFO_PRIMARY;
	public static final UniqueKey<SlaveWorkerInfoRecord> KEY_SLAVE_WORKER_INFO_PRIMARY = UniqueKeys0.KEY_SLAVE_WORKER_INFO_PRIMARY;
	public static final UniqueKey<TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = UniqueKeys0.KEY_TABLES_PRIV_PRIMARY;
	public static final UniqueKey<TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_PRIMARY;
	public static final UniqueKey<TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_LEAP_SECOND_PRIMARY;
	public static final UniqueKey<TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_NAME_PRIMARY;
	public static final UniqueKey<TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_PRIMARY;
	public static final UniqueKey<TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = UniqueKeys0.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
	public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<TimeZoneRecord, UInteger> IDENTITY_TIME_ZONE = createIdentity(TimeZone.TIME_ZONE, TimeZone.TIME_ZONE.TIME_ZONE_ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<ColumnsPrivRecord> KEY_COLUMNS_PRIV_PRIMARY = createUniqueKey(ColumnsPriv.COLUMNS_PRIV, ColumnsPriv.COLUMNS_PRIV.HOST, ColumnsPriv.COLUMNS_PRIV.DB, ColumnsPriv.COLUMNS_PRIV.USER, ColumnsPriv.COLUMNS_PRIV.TABLE_NAME, ColumnsPriv.COLUMNS_PRIV.COLUMN_NAME);
		public static final UniqueKey<DbRecord> KEY_DB_PRIMARY = createUniqueKey(Db.DB, Db.DB.HOST, Db.DB.DB_, Db.DB.USER);
		public static final UniqueKey<EngineCostRecord> KEY_ENGINE_COST_PRIMARY = createUniqueKey(EngineCost.ENGINE_COST, EngineCost.ENGINE_COST.COST_NAME, EngineCost.ENGINE_COST.ENGINE_NAME, EngineCost.ENGINE_COST.DEVICE_TYPE);
		public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = createUniqueKey(Event.EVENT, Event.EVENT.DB, Event.EVENT.NAME);
		public static final UniqueKey<FuncRecord> KEY_FUNC_PRIMARY = createUniqueKey(Func.FUNC, Func.FUNC.NAME);
		public static final UniqueKey<GtidExecutedRecord> KEY_GTID_EXECUTED_PRIMARY = createUniqueKey(GtidExecuted.GTID_EXECUTED, GtidExecuted.GTID_EXECUTED.SOURCE_UUID, GtidExecuted.GTID_EXECUTED.INTERVAL_START);
		public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_PRIMARY = createUniqueKey(HelpCategory.HELP_CATEGORY, HelpCategory.HELP_CATEGORY.HELP_CATEGORY_ID);
		public static final UniqueKey<HelpCategoryRecord> KEY_HELP_CATEGORY_NAME = createUniqueKey(HelpCategory.HELP_CATEGORY, HelpCategory.HELP_CATEGORY.NAME);
		public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_PRIMARY = createUniqueKey(HelpKeyword.HELP_KEYWORD, HelpKeyword.HELP_KEYWORD.HELP_KEYWORD_ID);
		public static final UniqueKey<HelpKeywordRecord> KEY_HELP_KEYWORD_NAME = createUniqueKey(HelpKeyword.HELP_KEYWORD, HelpKeyword.HELP_KEYWORD.NAME);
		public static final UniqueKey<HelpRelationRecord> KEY_HELP_RELATION_PRIMARY = createUniqueKey(HelpRelation.HELP_RELATION, HelpRelation.HELP_RELATION.HELP_KEYWORD_ID, HelpRelation.HELP_RELATION.HELP_TOPIC_ID);
		public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_PRIMARY = createUniqueKey(HelpTopic.HELP_TOPIC, HelpTopic.HELP_TOPIC.HELP_TOPIC_ID);
		public static final UniqueKey<HelpTopicRecord> KEY_HELP_TOPIC_NAME = createUniqueKey(HelpTopic.HELP_TOPIC, HelpTopic.HELP_TOPIC.NAME);
		public static final UniqueKey<InnodbIndexStatsRecord> KEY_INNODB_INDEX_STATS_PRIMARY = createUniqueKey(InnodbIndexStats.INNODB_INDEX_STATS, InnodbIndexStats.INNODB_INDEX_STATS.DATABASE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.TABLE_NAME, InnodbIndexStats.INNODB_INDEX_STATS.INDEX_NAME, InnodbIndexStats.INNODB_INDEX_STATS.STAT_NAME);
		public static final UniqueKey<InnodbTableStatsRecord> KEY_INNODB_TABLE_STATS_PRIMARY = createUniqueKey(InnodbTableStats.INNODB_TABLE_STATS, InnodbTableStats.INNODB_TABLE_STATS.DATABASE_NAME, InnodbTableStats.INNODB_TABLE_STATS.TABLE_NAME);
		public static final UniqueKey<NdbBinlogIndexRecord> KEY_NDB_BINLOG_INDEX_PRIMARY = createUniqueKey(NdbBinlogIndex.NDB_BINLOG_INDEX, NdbBinlogIndex.NDB_BINLOG_INDEX.EPOCH, NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_SERVER_ID, NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_EPOCH);
		public static final UniqueKey<PluginRecord> KEY_PLUGIN_PRIMARY = createUniqueKey(Plugin.PLUGIN, Plugin.PLUGIN.NAME);
		public static final UniqueKey<ProcRecord> KEY_PROC_PRIMARY = createUniqueKey(Proc.PROC, Proc.PROC.DB, Proc.PROC.NAME, Proc.PROC.TYPE);
		public static final UniqueKey<ProcsPrivRecord> KEY_PROCS_PRIV_PRIMARY = createUniqueKey(ProcsPriv.PROCS_PRIV, ProcsPriv.PROCS_PRIV.HOST, ProcsPriv.PROCS_PRIV.DB, ProcsPriv.PROCS_PRIV.USER, ProcsPriv.PROCS_PRIV.ROUTINE_NAME, ProcsPriv.PROCS_PRIV.ROUTINE_TYPE);
		public static final UniqueKey<ProxiesPrivRecord> KEY_PROXIES_PRIV_PRIMARY = createUniqueKey(ProxiesPriv.PROXIES_PRIV, ProxiesPriv.PROXIES_PRIV.HOST, ProxiesPriv.PROXIES_PRIV.USER, ProxiesPriv.PROXIES_PRIV.PROXIED_HOST, ProxiesPriv.PROXIES_PRIV.PROXIED_USER);
		public static final UniqueKey<ServersRecord> KEY_SERVERS_PRIMARY = createUniqueKey(Servers.SERVERS, Servers.SERVERS.SERVER_NAME);
		public static final UniqueKey<ServerCostRecord> KEY_SERVER_COST_PRIMARY = createUniqueKey(ServerCost.SERVER_COST, ServerCost.SERVER_COST.COST_NAME);
		public static final UniqueKey<SlaveMasterInfoRecord> KEY_SLAVE_MASTER_INFO_PRIMARY = createUniqueKey(SlaveMasterInfo.SLAVE_MASTER_INFO, SlaveMasterInfo.SLAVE_MASTER_INFO.CHANNEL_NAME);
		public static final UniqueKey<SlaveRelayLogInfoRecord> KEY_SLAVE_RELAY_LOG_INFO_PRIMARY = createUniqueKey(SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO, SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO.CHANNEL_NAME);
		public static final UniqueKey<SlaveWorkerInfoRecord> KEY_SLAVE_WORKER_INFO_PRIMARY = createUniqueKey(SlaveWorkerInfo.SLAVE_WORKER_INFO, SlaveWorkerInfo.SLAVE_WORKER_INFO.CHANNEL_NAME, SlaveWorkerInfo.SLAVE_WORKER_INFO.ID);
		public static final UniqueKey<TablesPrivRecord> KEY_TABLES_PRIV_PRIMARY = createUniqueKey(TablesPriv.TABLES_PRIV, TablesPriv.TABLES_PRIV.HOST, TablesPriv.TABLES_PRIV.DB, TablesPriv.TABLES_PRIV.USER, TablesPriv.TABLES_PRIV.TABLE_NAME);
		public static final UniqueKey<TimeZoneRecord> KEY_TIME_ZONE_PRIMARY = createUniqueKey(TimeZone.TIME_ZONE, TimeZone.TIME_ZONE.TIME_ZONE_ID);
		public static final UniqueKey<TimeZoneLeapSecondRecord> KEY_TIME_ZONE_LEAP_SECOND_PRIMARY = createUniqueKey(TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND, TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND.TRANSITION_TIME);
		public static final UniqueKey<TimeZoneNameRecord> KEY_TIME_ZONE_NAME_PRIMARY = createUniqueKey(TimeZoneName.TIME_ZONE_NAME, TimeZoneName.TIME_ZONE_NAME.NAME);
		public static final UniqueKey<TimeZoneTransitionRecord> KEY_TIME_ZONE_TRANSITION_PRIMARY = createUniqueKey(TimeZoneTransition.TIME_ZONE_TRANSITION, TimeZoneTransition.TIME_ZONE_TRANSITION.TIME_ZONE_ID, TimeZoneTransition.TIME_ZONE_TRANSITION.TRANSITION_TIME);
		public static final UniqueKey<TimeZoneTransitionTypeRecord> KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY = createUniqueKey(TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE, TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TIME_ZONE_ID, TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE.TRANSITION_TYPE_ID);
		public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, User.USER.HOST, User.USER.USER_);
	}
}
