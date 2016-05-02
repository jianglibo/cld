/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.example.gradle.db.performance_schema.tables.Accounts;
import org.jooq.example.gradle.db.performance_schema.tables.CondInstances;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByDigest;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByProgram;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsCurrent;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistory;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsHistoryLong;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.FileInstances;
import org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.FileSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.GlobalStatus;
import org.jooq.example.gradle.db.performance_schema.tables.GlobalVariables;
import org.jooq.example.gradle.db.performance_schema.tables.HostCache;
import org.jooq.example.gradle.db.performance_schema.tables.Hosts;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByAccountByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByHostByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByThreadByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryByUserByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MemorySummaryGlobalByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.MetadataLocks;
import org.jooq.example.gradle.db.performance_schema.tables.MutexInstances;
import org.jooq.example.gradle.db.performance_schema.tables.ObjectsSummaryGlobalByType;
import org.jooq.example.gradle.db.performance_schema.tables.PerformanceTimers;
import org.jooq.example.gradle.db.performance_schema.tables.PreparedStatementsInstances;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierConfiguration;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatus;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByCoordinator;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationApplierStatusByWorker;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionConfiguration;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationConnectionStatus;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMemberStats;
import org.jooq.example.gradle.db.performance_schema.tables.ReplicationGroupMembers;
import org.jooq.example.gradle.db.performance_schema.tables.RwlockInstances;
import org.jooq.example.gradle.db.performance_schema.tables.SessionAccountConnectAttrs;
import org.jooq.example.gradle.db.performance_schema.tables.SessionConnectAttrs;
import org.jooq.example.gradle.db.performance_schema.tables.SessionStatus;
import org.jooq.example.gradle.db.performance_schema.tables.SessionVariables;
import org.jooq.example.gradle.db.performance_schema.tables.SetupActors;
import org.jooq.example.gradle.db.performance_schema.tables.SetupConsumers;
import org.jooq.example.gradle.db.performance_schema.tables.SetupInstruments;
import org.jooq.example.gradle.db.performance_schema.tables.SetupObjects;
import org.jooq.example.gradle.db.performance_schema.tables.SetupTimers;
import org.jooq.example.gradle.db.performance_schema.tables.SocketInstances;
import org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByEventName;
import org.jooq.example.gradle.db.performance_schema.tables.SocketSummaryByInstance;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByAccount;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByHost;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByThread;
import org.jooq.example.gradle.db.performance_schema.tables.StatusByUser;
import org.jooq.example.gradle.db.performance_schema.tables.TableHandles;
import org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import org.jooq.example.gradle.db.performance_schema.tables.TableIoWaitsSummaryByTable;
import org.jooq.example.gradle.db.performance_schema.tables.TableLockWaitsSummaryByTable;
import org.jooq.example.gradle.db.performance_schema.tables.Threads;
import org.jooq.example.gradle.db.performance_schema.tables.UserVariablesByThread;
import org.jooq.example.gradle.db.performance_schema.tables.Users;
import org.jooq.example.gradle.db.performance_schema.tables.VariablesByThread;
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
public class PerformanceSchema extends SchemaImpl {

	private static final long serialVersionUID = -35975015;

	/**
	 * The reference instance of <code>performance_schema</code>
	 */
	public static final PerformanceSchema PERFORMANCE_SCHEMA = new PerformanceSchema();

	/**
	 * No further instances allowed
	 */
	private PerformanceSchema() {
		super("performance_schema");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Accounts.ACCOUNTS,
			CondInstances.COND_INSTANCES,
			EventsStagesCurrent.EVENTS_STAGES_CURRENT,
			EventsStagesHistory.EVENTS_STAGES_HISTORY,
			EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG,
			EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
			EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME,
			EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME,
			EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME,
			EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT,
			EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY,
			EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG,
			EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
			EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST,
			EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME,
			EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM,
			EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME,
			EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME,
			EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT,
			EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY,
			EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG,
			EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
			EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME,
			EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME,
			EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME,
			EventsWaitsCurrent.EVENTS_WAITS_CURRENT,
			EventsWaitsHistory.EVENTS_WAITS_HISTORY,
			EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG,
			EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
			EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME,
			EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE,
			EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME,
			EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME,
			FileInstances.FILE_INSTANCES,
			FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME,
			FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE,
			GlobalStatus.GLOBAL_STATUS,
			GlobalVariables.GLOBAL_VARIABLES,
			Hosts.HOSTS,
			HostCache.HOST_CACHE,
			MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
			MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME,
			MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME,
			MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME,
			MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME,
			MetadataLocks.METADATA_LOCKS,
			MutexInstances.MUTEX_INSTANCES,
			ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE,
			PerformanceTimers.PERFORMANCE_TIMERS,
			PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES,
			ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION,
			ReplicationApplierStatus.REPLICATION_APPLIER_STATUS,
			ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR,
			ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER,
			ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION,
			ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS,
			ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS,
			ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS,
			RwlockInstances.RWLOCK_INSTANCES,
			SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS,
			SessionConnectAttrs.SESSION_CONNECT_ATTRS,
			SessionStatus.SESSION_STATUS,
			SessionVariables.SESSION_VARIABLES,
			SetupActors.SETUP_ACTORS,
			SetupConsumers.SETUP_CONSUMERS,
			SetupInstruments.SETUP_INSTRUMENTS,
			SetupObjects.SETUP_OBJECTS,
			SetupTimers.SETUP_TIMERS,
			SocketInstances.SOCKET_INSTANCES,
			SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME,
			SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE,
			StatusByAccount.STATUS_BY_ACCOUNT,
			StatusByHost.STATUS_BY_HOST,
			StatusByThread.STATUS_BY_THREAD,
			StatusByUser.STATUS_BY_USER,
			TableHandles.TABLE_HANDLES,
			TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE,
			TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE,
			TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE,
			Threads.THREADS,
			Users.USERS,
			UserVariablesByThread.USER_VARIABLES_BY_THREAD,
			VariablesByThread.VARIABLES_BY_THREAD);
	}
}