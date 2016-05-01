/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys;


import com.mymock.db.sys.tables.HostSummary;
import com.mymock.db.sys.tables.HostSummaryByFileIo;
import com.mymock.db.sys.tables.HostSummaryByFileIoType;
import com.mymock.db.sys.tables.HostSummaryByStages;
import com.mymock.db.sys.tables.HostSummaryByStatementLatency;
import com.mymock.db.sys.tables.HostSummaryByStatementType;
import com.mymock.db.sys.tables.InnodbBufferStatsBySchema;
import com.mymock.db.sys.tables.InnodbBufferStatsByTable;
import com.mymock.db.sys.tables.InnodbLockWaits;
import com.mymock.db.sys.tables.IoByThreadByLatency;
import com.mymock.db.sys.tables.IoGlobalByFileByBytes;
import com.mymock.db.sys.tables.IoGlobalByFileByLatency;
import com.mymock.db.sys.tables.IoGlobalByWaitByBytes;
import com.mymock.db.sys.tables.IoGlobalByWaitByLatency;
import com.mymock.db.sys.tables.LatestFileIo;
import com.mymock.db.sys.tables.MemoryByHostByCurrentBytes;
import com.mymock.db.sys.tables.MemoryByThreadByCurrentBytes;
import com.mymock.db.sys.tables.MemoryByUserByCurrentBytes;
import com.mymock.db.sys.tables.MemoryGlobalByCurrentBytes;
import com.mymock.db.sys.tables.MemoryGlobalTotal;
import com.mymock.db.sys.tables.Metrics;
import com.mymock.db.sys.tables.Processlist;
import com.mymock.db.sys.tables.PsCheckLostInstrumentation;
import com.mymock.db.sys.tables.SchemaAutoIncrementColumns;
import com.mymock.db.sys.tables.SchemaIndexStatistics;
import com.mymock.db.sys.tables.SchemaObjectOverview;
import com.mymock.db.sys.tables.SchemaRedundantIndexes;
import com.mymock.db.sys.tables.SchemaTableLockWaits;
import com.mymock.db.sys.tables.SchemaTableStatistics;
import com.mymock.db.sys.tables.SchemaTableStatisticsWithBuffer;
import com.mymock.db.sys.tables.SchemaTablesWithFullTableScans;
import com.mymock.db.sys.tables.SchemaUnusedIndexes;
import com.mymock.db.sys.tables.Session;
import com.mymock.db.sys.tables.SessionSslStatus;
import com.mymock.db.sys.tables.StatementAnalysis;
import com.mymock.db.sys.tables.StatementsWithErrorsOrWarnings;
import com.mymock.db.sys.tables.StatementsWithFullTableScans;
import com.mymock.db.sys.tables.StatementsWithRuntimesIn_95thPercentile;
import com.mymock.db.sys.tables.StatementsWithSorting;
import com.mymock.db.sys.tables.StatementsWithTempTables;
import com.mymock.db.sys.tables.SysConfig;
import com.mymock.db.sys.tables.UserSummary;
import com.mymock.db.sys.tables.UserSummaryByFileIo;
import com.mymock.db.sys.tables.UserSummaryByFileIoType;
import com.mymock.db.sys.tables.UserSummaryByStages;
import com.mymock.db.sys.tables.UserSummaryByStatementLatency;
import com.mymock.db.sys.tables.UserSummaryByStatementType;
import com.mymock.db.sys.tables.Version;
import com.mymock.db.sys.tables.WaitClassesGlobalByAvgLatency;
import com.mymock.db.sys.tables.WaitClassesGlobalByLatency;
import com.mymock.db.sys.tables.WaitsByHostByLatency;
import com.mymock.db.sys.tables.WaitsByUserByLatency;
import com.mymock.db.sys.tables.WaitsGlobalByLatency;
import com.mymock.db.sys.tables.X$hostSummary;
import com.mymock.db.sys.tables.X$hostSummaryByFileIo;
import com.mymock.db.sys.tables.X$hostSummaryByFileIoType;
import com.mymock.db.sys.tables.X$hostSummaryByStages;
import com.mymock.db.sys.tables.X$hostSummaryByStatementLatency;
import com.mymock.db.sys.tables.X$hostSummaryByStatementType;
import com.mymock.db.sys.tables.X$innodbBufferStatsBySchema;
import com.mymock.db.sys.tables.X$innodbBufferStatsByTable;
import com.mymock.db.sys.tables.X$innodbLockWaits;
import com.mymock.db.sys.tables.X$ioByThreadByLatency;
import com.mymock.db.sys.tables.X$ioGlobalByFileByBytes;
import com.mymock.db.sys.tables.X$ioGlobalByFileByLatency;
import com.mymock.db.sys.tables.X$ioGlobalByWaitByBytes;
import com.mymock.db.sys.tables.X$ioGlobalByWaitByLatency;
import com.mymock.db.sys.tables.X$latestFileIo;
import com.mymock.db.sys.tables.X$memoryByHostByCurrentBytes;
import com.mymock.db.sys.tables.X$memoryByThreadByCurrentBytes;
import com.mymock.db.sys.tables.X$memoryByUserByCurrentBytes;
import com.mymock.db.sys.tables.X$memoryGlobalByCurrentBytes;
import com.mymock.db.sys.tables.X$memoryGlobalTotal;
import com.mymock.db.sys.tables.X$processlist;
import com.mymock.db.sys.tables.X$psDigestAvgLatencyDistribution;
import com.mymock.db.sys.tables.X$psDigest_95thPercentileByAvgUs;
import com.mymock.db.sys.tables.X$psSchemaTableStatisticsIo;
import com.mymock.db.sys.tables.X$schemaFlattenedKeys;
import com.mymock.db.sys.tables.X$schemaIndexStatistics;
import com.mymock.db.sys.tables.X$schemaTableLockWaits;
import com.mymock.db.sys.tables.X$schemaTableStatistics;
import com.mymock.db.sys.tables.X$schemaTableStatisticsWithBuffer;
import com.mymock.db.sys.tables.X$schemaTablesWithFullTableScans;
import com.mymock.db.sys.tables.X$session;
import com.mymock.db.sys.tables.X$statementAnalysis;
import com.mymock.db.sys.tables.X$statementsWithErrorsOrWarnings;
import com.mymock.db.sys.tables.X$statementsWithFullTableScans;
import com.mymock.db.sys.tables.X$statementsWithRuntimesIn_95thPercentile;
import com.mymock.db.sys.tables.X$statementsWithSorting;
import com.mymock.db.sys.tables.X$statementsWithTempTables;
import com.mymock.db.sys.tables.X$userSummary;
import com.mymock.db.sys.tables.X$userSummaryByFileIo;
import com.mymock.db.sys.tables.X$userSummaryByFileIoType;
import com.mymock.db.sys.tables.X$userSummaryByStages;
import com.mymock.db.sys.tables.X$userSummaryByStatementLatency;
import com.mymock.db.sys.tables.X$userSummaryByStatementType;
import com.mymock.db.sys.tables.X$waitClassesGlobalByAvgLatency;
import com.mymock.db.sys.tables.X$waitClassesGlobalByLatency;
import com.mymock.db.sys.tables.X$waitsByHostByLatency;
import com.mymock.db.sys.tables.X$waitsByUserByLatency;
import com.mymock.db.sys.tables.X$waitsGlobalByLatency;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in sys
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
	 * VIEW
	 */
	public static final HostSummary HOST_SUMMARY = com.mymock.db.sys.tables.HostSummary.HOST_SUMMARY;

	/**
	 * VIEW
	 */
	public static final HostSummaryByFileIo HOST_SUMMARY_BY_FILE_IO = com.mymock.db.sys.tables.HostSummaryByFileIo.HOST_SUMMARY_BY_FILE_IO;

	/**
	 * VIEW
	 */
	public static final HostSummaryByFileIoType HOST_SUMMARY_BY_FILE_IO_TYPE = com.mymock.db.sys.tables.HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE;

	/**
	 * VIEW
	 */
	public static final HostSummaryByStages HOST_SUMMARY_BY_STAGES = com.mymock.db.sys.tables.HostSummaryByStages.HOST_SUMMARY_BY_STAGES;

	/**
	 * VIEW
	 */
	public static final HostSummaryByStatementLatency HOST_SUMMARY_BY_STATEMENT_LATENCY = com.mymock.db.sys.tables.HostSummaryByStatementLatency.HOST_SUMMARY_BY_STATEMENT_LATENCY;

	/**
	 * VIEW
	 */
	public static final HostSummaryByStatementType HOST_SUMMARY_BY_STATEMENT_TYPE = com.mymock.db.sys.tables.HostSummaryByStatementType.HOST_SUMMARY_BY_STATEMENT_TYPE;

	/**
	 * VIEW
	 */
	public static final InnodbBufferStatsBySchema INNODB_BUFFER_STATS_BY_SCHEMA = com.mymock.db.sys.tables.InnodbBufferStatsBySchema.INNODB_BUFFER_STATS_BY_SCHEMA;

	/**
	 * VIEW
	 */
	public static final InnodbBufferStatsByTable INNODB_BUFFER_STATS_BY_TABLE = com.mymock.db.sys.tables.InnodbBufferStatsByTable.INNODB_BUFFER_STATS_BY_TABLE;

	/**
	 * VIEW
	 */
	public static final InnodbLockWaits INNODB_LOCK_WAITS = com.mymock.db.sys.tables.InnodbLockWaits.INNODB_LOCK_WAITS;

	/**
	 * VIEW
	 */
	public static final IoByThreadByLatency IO_BY_THREAD_BY_LATENCY = com.mymock.db.sys.tables.IoByThreadByLatency.IO_BY_THREAD_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final IoGlobalByFileByBytes IO_GLOBAL_BY_FILE_BY_BYTES = com.mymock.db.sys.tables.IoGlobalByFileByBytes.IO_GLOBAL_BY_FILE_BY_BYTES;

	/**
	 * VIEW
	 */
	public static final IoGlobalByFileByLatency IO_GLOBAL_BY_FILE_BY_LATENCY = com.mymock.db.sys.tables.IoGlobalByFileByLatency.IO_GLOBAL_BY_FILE_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final IoGlobalByWaitByBytes IO_GLOBAL_BY_WAIT_BY_BYTES = com.mymock.db.sys.tables.IoGlobalByWaitByBytes.IO_GLOBAL_BY_WAIT_BY_BYTES;

	/**
	 * VIEW
	 */
	public static final IoGlobalByWaitByLatency IO_GLOBAL_BY_WAIT_BY_LATENCY = com.mymock.db.sys.tables.IoGlobalByWaitByLatency.IO_GLOBAL_BY_WAIT_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final LatestFileIo LATEST_FILE_IO = com.mymock.db.sys.tables.LatestFileIo.LATEST_FILE_IO;

	/**
	 * VIEW
	 */
	public static final MemoryByHostByCurrentBytes MEMORY_BY_HOST_BY_CURRENT_BYTES = com.mymock.db.sys.tables.MemoryByHostByCurrentBytes.MEMORY_BY_HOST_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final MemoryByThreadByCurrentBytes MEMORY_BY_THREAD_BY_CURRENT_BYTES = com.mymock.db.sys.tables.MemoryByThreadByCurrentBytes.MEMORY_BY_THREAD_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final MemoryByUserByCurrentBytes MEMORY_BY_USER_BY_CURRENT_BYTES = com.mymock.db.sys.tables.MemoryByUserByCurrentBytes.MEMORY_BY_USER_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final MemoryGlobalByCurrentBytes MEMORY_GLOBAL_BY_CURRENT_BYTES = com.mymock.db.sys.tables.MemoryGlobalByCurrentBytes.MEMORY_GLOBAL_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final MemoryGlobalTotal MEMORY_GLOBAL_TOTAL = com.mymock.db.sys.tables.MemoryGlobalTotal.MEMORY_GLOBAL_TOTAL;

	/**
	 * VIEW
	 */
	public static final Metrics METRICS = com.mymock.db.sys.tables.Metrics.METRICS;

	/**
	 * VIEW
	 */
	public static final Processlist PROCESSLIST = com.mymock.db.sys.tables.Processlist.PROCESSLIST;

	/**
	 * VIEW
	 */
	public static final PsCheckLostInstrumentation PS_CHECK_LOST_INSTRUMENTATION = com.mymock.db.sys.tables.PsCheckLostInstrumentation.PS_CHECK_LOST_INSTRUMENTATION;

	/**
	 * VIEW
	 */
	public static final SchemaAutoIncrementColumns SCHEMA_AUTO_INCREMENT_COLUMNS = com.mymock.db.sys.tables.SchemaAutoIncrementColumns.SCHEMA_AUTO_INCREMENT_COLUMNS;

	/**
	 * VIEW
	 */
	public static final SchemaIndexStatistics SCHEMA_INDEX_STATISTICS = com.mymock.db.sys.tables.SchemaIndexStatistics.SCHEMA_INDEX_STATISTICS;

	/**
	 * VIEW
	 */
	public static final SchemaObjectOverview SCHEMA_OBJECT_OVERVIEW = com.mymock.db.sys.tables.SchemaObjectOverview.SCHEMA_OBJECT_OVERVIEW;

	/**
	 * VIEW
	 */
	public static final SchemaRedundantIndexes SCHEMA_REDUNDANT_INDEXES = com.mymock.db.sys.tables.SchemaRedundantIndexes.SCHEMA_REDUNDANT_INDEXES;

	/**
	 * VIEW
	 */
	public static final SchemaTablesWithFullTableScans SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = com.mymock.db.sys.tables.SchemaTablesWithFullTableScans.SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

	/**
	 * VIEW
	 */
	public static final SchemaTableLockWaits SCHEMA_TABLE_LOCK_WAITS = com.mymock.db.sys.tables.SchemaTableLockWaits.SCHEMA_TABLE_LOCK_WAITS;

	/**
	 * VIEW
	 */
	public static final SchemaTableStatistics SCHEMA_TABLE_STATISTICS = com.mymock.db.sys.tables.SchemaTableStatistics.SCHEMA_TABLE_STATISTICS;

	/**
	 * VIEW
	 */
	public static final SchemaTableStatisticsWithBuffer SCHEMA_TABLE_STATISTICS_WITH_BUFFER = com.mymock.db.sys.tables.SchemaTableStatisticsWithBuffer.SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

	/**
	 * VIEW
	 */
	public static final SchemaUnusedIndexes SCHEMA_UNUSED_INDEXES = com.mymock.db.sys.tables.SchemaUnusedIndexes.SCHEMA_UNUSED_INDEXES;

	/**
	 * VIEW
	 */
	public static final Session SESSION = com.mymock.db.sys.tables.Session.SESSION;

	/**
	 * VIEW
	 */
	public static final SessionSslStatus SESSION_SSL_STATUS = com.mymock.db.sys.tables.SessionSslStatus.SESSION_SSL_STATUS;

	/**
	 * VIEW
	 */
	public static final StatementsWithErrorsOrWarnings STATEMENTS_WITH_ERRORS_OR_WARNINGS = com.mymock.db.sys.tables.StatementsWithErrorsOrWarnings.STATEMENTS_WITH_ERRORS_OR_WARNINGS;

	/**
	 * VIEW
	 */
	public static final StatementsWithFullTableScans STATEMENTS_WITH_FULL_TABLE_SCANS = com.mymock.db.sys.tables.StatementsWithFullTableScans.STATEMENTS_WITH_FULL_TABLE_SCANS;

	/**
	 * VIEW
	 */
	public static final StatementsWithRuntimesIn_95thPercentile STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = com.mymock.db.sys.tables.StatementsWithRuntimesIn_95thPercentile.STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

	/**
	 * VIEW
	 */
	public static final StatementsWithSorting STATEMENTS_WITH_SORTING = com.mymock.db.sys.tables.StatementsWithSorting.STATEMENTS_WITH_SORTING;

	/**
	 * VIEW
	 */
	public static final StatementsWithTempTables STATEMENTS_WITH_TEMP_TABLES = com.mymock.db.sys.tables.StatementsWithTempTables.STATEMENTS_WITH_TEMP_TABLES;

	/**
	 * VIEW
	 */
	public static final StatementAnalysis STATEMENT_ANALYSIS = com.mymock.db.sys.tables.StatementAnalysis.STATEMENT_ANALYSIS;

	/**
	 * The table sys.sys_config
	 */
	public static final SysConfig SYS_CONFIG = com.mymock.db.sys.tables.SysConfig.SYS_CONFIG;

	/**
	 * VIEW
	 */
	public static final UserSummary USER_SUMMARY = com.mymock.db.sys.tables.UserSummary.USER_SUMMARY;

	/**
	 * VIEW
	 */
	public static final UserSummaryByFileIo USER_SUMMARY_BY_FILE_IO = com.mymock.db.sys.tables.UserSummaryByFileIo.USER_SUMMARY_BY_FILE_IO;

	/**
	 * VIEW
	 */
	public static final UserSummaryByFileIoType USER_SUMMARY_BY_FILE_IO_TYPE = com.mymock.db.sys.tables.UserSummaryByFileIoType.USER_SUMMARY_BY_FILE_IO_TYPE;

	/**
	 * VIEW
	 */
	public static final UserSummaryByStages USER_SUMMARY_BY_STAGES = com.mymock.db.sys.tables.UserSummaryByStages.USER_SUMMARY_BY_STAGES;

	/**
	 * VIEW
	 */
	public static final UserSummaryByStatementLatency USER_SUMMARY_BY_STATEMENT_LATENCY = com.mymock.db.sys.tables.UserSummaryByStatementLatency.USER_SUMMARY_BY_STATEMENT_LATENCY;

	/**
	 * VIEW
	 */
	public static final UserSummaryByStatementType USER_SUMMARY_BY_STATEMENT_TYPE = com.mymock.db.sys.tables.UserSummaryByStatementType.USER_SUMMARY_BY_STATEMENT_TYPE;

	/**
	 * VIEW
	 */
	public static final Version VERSION = com.mymock.db.sys.tables.Version.VERSION;

	/**
	 * VIEW
	 */
	public static final WaitsByHostByLatency WAITS_BY_HOST_BY_LATENCY = com.mymock.db.sys.tables.WaitsByHostByLatency.WAITS_BY_HOST_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final WaitsByUserByLatency WAITS_BY_USER_BY_LATENCY = com.mymock.db.sys.tables.WaitsByUserByLatency.WAITS_BY_USER_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final WaitsGlobalByLatency WAITS_GLOBAL_BY_LATENCY = com.mymock.db.sys.tables.WaitsGlobalByLatency.WAITS_GLOBAL_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final WaitClassesGlobalByAvgLatency WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = com.mymock.db.sys.tables.WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

	/**
	 * VIEW
	 */
	public static final WaitClassesGlobalByLatency WAIT_CLASSES_GLOBAL_BY_LATENCY = com.mymock.db.sys.tables.WaitClassesGlobalByLatency.WAIT_CLASSES_GLOBAL_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$hostSummary X$HOST_SUMMARY = com.mymock.db.sys.tables.X$hostSummary.X$HOST_SUMMARY;

	/**
	 * VIEW
	 */
	public static final X$hostSummaryByFileIo X$HOST_SUMMARY_BY_FILE_IO = com.mymock.db.sys.tables.X$hostSummaryByFileIo.X$HOST_SUMMARY_BY_FILE_IO;

	/**
	 * VIEW
	 */
	public static final X$hostSummaryByFileIoType X$HOST_SUMMARY_BY_FILE_IO_TYPE = com.mymock.db.sys.tables.X$hostSummaryByFileIoType.X$HOST_SUMMARY_BY_FILE_IO_TYPE;

	/**
	 * VIEW
	 */
	public static final X$hostSummaryByStages X$HOST_SUMMARY_BY_STAGES = com.mymock.db.sys.tables.X$hostSummaryByStages.X$HOST_SUMMARY_BY_STAGES;

	/**
	 * VIEW
	 */
	public static final X$hostSummaryByStatementLatency X$HOST_SUMMARY_BY_STATEMENT_LATENCY = com.mymock.db.sys.tables.X$hostSummaryByStatementLatency.X$HOST_SUMMARY_BY_STATEMENT_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$hostSummaryByStatementType X$HOST_SUMMARY_BY_STATEMENT_TYPE = com.mymock.db.sys.tables.X$hostSummaryByStatementType.X$HOST_SUMMARY_BY_STATEMENT_TYPE;

	/**
	 * VIEW
	 */
	public static final X$innodbBufferStatsBySchema X$INNODB_BUFFER_STATS_BY_SCHEMA = com.mymock.db.sys.tables.X$innodbBufferStatsBySchema.X$INNODB_BUFFER_STATS_BY_SCHEMA;

	/**
	 * VIEW
	 */
	public static final X$innodbBufferStatsByTable X$INNODB_BUFFER_STATS_BY_TABLE = com.mymock.db.sys.tables.X$innodbBufferStatsByTable.X$INNODB_BUFFER_STATS_BY_TABLE;

	/**
	 * VIEW
	 */
	public static final X$innodbLockWaits X$INNODB_LOCK_WAITS = com.mymock.db.sys.tables.X$innodbLockWaits.X$INNODB_LOCK_WAITS;

	/**
	 * VIEW
	 */
	public static final X$ioByThreadByLatency X$IO_BY_THREAD_BY_LATENCY = com.mymock.db.sys.tables.X$ioByThreadByLatency.X$IO_BY_THREAD_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$ioGlobalByFileByBytes X$IO_GLOBAL_BY_FILE_BY_BYTES = com.mymock.db.sys.tables.X$ioGlobalByFileByBytes.X$IO_GLOBAL_BY_FILE_BY_BYTES;

	/**
	 * VIEW
	 */
	public static final X$ioGlobalByFileByLatency X$IO_GLOBAL_BY_FILE_BY_LATENCY = com.mymock.db.sys.tables.X$ioGlobalByFileByLatency.X$IO_GLOBAL_BY_FILE_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$ioGlobalByWaitByBytes X$IO_GLOBAL_BY_WAIT_BY_BYTES = com.mymock.db.sys.tables.X$ioGlobalByWaitByBytes.X$IO_GLOBAL_BY_WAIT_BY_BYTES;

	/**
	 * VIEW
	 */
	public static final X$ioGlobalByWaitByLatency X$IO_GLOBAL_BY_WAIT_BY_LATENCY = com.mymock.db.sys.tables.X$ioGlobalByWaitByLatency.X$IO_GLOBAL_BY_WAIT_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$latestFileIo X$LATEST_FILE_IO = com.mymock.db.sys.tables.X$latestFileIo.X$LATEST_FILE_IO;

	/**
	 * VIEW
	 */
	public static final X$memoryByHostByCurrentBytes X$MEMORY_BY_HOST_BY_CURRENT_BYTES = com.mymock.db.sys.tables.X$memoryByHostByCurrentBytes.X$MEMORY_BY_HOST_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final X$memoryByThreadByCurrentBytes X$MEMORY_BY_THREAD_BY_CURRENT_BYTES = com.mymock.db.sys.tables.X$memoryByThreadByCurrentBytes.X$MEMORY_BY_THREAD_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final X$memoryByUserByCurrentBytes X$MEMORY_BY_USER_BY_CURRENT_BYTES = com.mymock.db.sys.tables.X$memoryByUserByCurrentBytes.X$MEMORY_BY_USER_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final X$memoryGlobalByCurrentBytes X$MEMORY_GLOBAL_BY_CURRENT_BYTES = com.mymock.db.sys.tables.X$memoryGlobalByCurrentBytes.X$MEMORY_GLOBAL_BY_CURRENT_BYTES;

	/**
	 * VIEW
	 */
	public static final X$memoryGlobalTotal X$MEMORY_GLOBAL_TOTAL = com.mymock.db.sys.tables.X$memoryGlobalTotal.X$MEMORY_GLOBAL_TOTAL;

	/**
	 * VIEW
	 */
	public static final X$processlist X$PROCESSLIST = com.mymock.db.sys.tables.X$processlist.X$PROCESSLIST;

	/**
	 * VIEW
	 */
	public static final X$psDigest_95thPercentileByAvgUs X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US = com.mymock.db.sys.tables.X$psDigest_95thPercentileByAvgUs.X$PS_DIGEST_95TH_PERCENTILE_BY_AVG_US;

	/**
	 * VIEW
	 */
	public static final X$psDigestAvgLatencyDistribution X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION = com.mymock.db.sys.tables.X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION;

	/**
	 * VIEW
	 */
	public static final X$psSchemaTableStatisticsIo X$PS_SCHEMA_TABLE_STATISTICS_IO = com.mymock.db.sys.tables.X$psSchemaTableStatisticsIo.X$PS_SCHEMA_TABLE_STATISTICS_IO;

	/**
	 * VIEW
	 */
	public static final X$schemaFlattenedKeys X$SCHEMA_FLATTENED_KEYS = com.mymock.db.sys.tables.X$schemaFlattenedKeys.X$SCHEMA_FLATTENED_KEYS;

	/**
	 * VIEW
	 */
	public static final X$schemaIndexStatistics X$SCHEMA_INDEX_STATISTICS = com.mymock.db.sys.tables.X$schemaIndexStatistics.X$SCHEMA_INDEX_STATISTICS;

	/**
	 * VIEW
	 */
	public static final X$schemaTablesWithFullTableScans X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = com.mymock.db.sys.tables.X$schemaTablesWithFullTableScans.X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS;

	/**
	 * VIEW
	 */
	public static final X$schemaTableLockWaits X$SCHEMA_TABLE_LOCK_WAITS = com.mymock.db.sys.tables.X$schemaTableLockWaits.X$SCHEMA_TABLE_LOCK_WAITS;

	/**
	 * VIEW
	 */
	public static final X$schemaTableStatistics X$SCHEMA_TABLE_STATISTICS = com.mymock.db.sys.tables.X$schemaTableStatistics.X$SCHEMA_TABLE_STATISTICS;

	/**
	 * VIEW
	 */
	public static final X$schemaTableStatisticsWithBuffer X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER = com.mymock.db.sys.tables.X$schemaTableStatisticsWithBuffer.X$SCHEMA_TABLE_STATISTICS_WITH_BUFFER;

	/**
	 * VIEW
	 */
	public static final X$session X$SESSION = com.mymock.db.sys.tables.X$session.X$SESSION;

	/**
	 * VIEW
	 */
	public static final X$statementsWithErrorsOrWarnings X$STATEMENTS_WITH_ERRORS_OR_WARNINGS = com.mymock.db.sys.tables.X$statementsWithErrorsOrWarnings.X$STATEMENTS_WITH_ERRORS_OR_WARNINGS;

	/**
	 * VIEW
	 */
	public static final X$statementsWithFullTableScans X$STATEMENTS_WITH_FULL_TABLE_SCANS = com.mymock.db.sys.tables.X$statementsWithFullTableScans.X$STATEMENTS_WITH_FULL_TABLE_SCANS;

	/**
	 * VIEW
	 */
	public static final X$statementsWithRuntimesIn_95thPercentile X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE = com.mymock.db.sys.tables.X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE;

	/**
	 * VIEW
	 */
	public static final X$statementsWithSorting X$STATEMENTS_WITH_SORTING = com.mymock.db.sys.tables.X$statementsWithSorting.X$STATEMENTS_WITH_SORTING;

	/**
	 * VIEW
	 */
	public static final X$statementsWithTempTables X$STATEMENTS_WITH_TEMP_TABLES = com.mymock.db.sys.tables.X$statementsWithTempTables.X$STATEMENTS_WITH_TEMP_TABLES;

	/**
	 * VIEW
	 */
	public static final X$statementAnalysis X$STATEMENT_ANALYSIS = com.mymock.db.sys.tables.X$statementAnalysis.X$STATEMENT_ANALYSIS;

	/**
	 * VIEW
	 */
	public static final X$userSummary X$USER_SUMMARY = com.mymock.db.sys.tables.X$userSummary.X$USER_SUMMARY;

	/**
	 * VIEW
	 */
	public static final X$userSummaryByFileIo X$USER_SUMMARY_BY_FILE_IO = com.mymock.db.sys.tables.X$userSummaryByFileIo.X$USER_SUMMARY_BY_FILE_IO;

	/**
	 * VIEW
	 */
	public static final X$userSummaryByFileIoType X$USER_SUMMARY_BY_FILE_IO_TYPE = com.mymock.db.sys.tables.X$userSummaryByFileIoType.X$USER_SUMMARY_BY_FILE_IO_TYPE;

	/**
	 * VIEW
	 */
	public static final X$userSummaryByStages X$USER_SUMMARY_BY_STAGES = com.mymock.db.sys.tables.X$userSummaryByStages.X$USER_SUMMARY_BY_STAGES;

	/**
	 * VIEW
	 */
	public static final X$userSummaryByStatementLatency X$USER_SUMMARY_BY_STATEMENT_LATENCY = com.mymock.db.sys.tables.X$userSummaryByStatementLatency.X$USER_SUMMARY_BY_STATEMENT_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$userSummaryByStatementType X$USER_SUMMARY_BY_STATEMENT_TYPE = com.mymock.db.sys.tables.X$userSummaryByStatementType.X$USER_SUMMARY_BY_STATEMENT_TYPE;

	/**
	 * VIEW
	 */
	public static final X$waitsByHostByLatency X$WAITS_BY_HOST_BY_LATENCY = com.mymock.db.sys.tables.X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$waitsByUserByLatency X$WAITS_BY_USER_BY_LATENCY = com.mymock.db.sys.tables.X$waitsByUserByLatency.X$WAITS_BY_USER_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$waitsGlobalByLatency X$WAITS_GLOBAL_BY_LATENCY = com.mymock.db.sys.tables.X$waitsGlobalByLatency.X$WAITS_GLOBAL_BY_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$waitClassesGlobalByAvgLatency X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY = com.mymock.db.sys.tables.X$waitClassesGlobalByAvgLatency.X$WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY;

	/**
	 * VIEW
	 */
	public static final X$waitClassesGlobalByLatency X$WAIT_CLASSES_GLOBAL_BY_LATENCY = com.mymock.db.sys.tables.X$waitClassesGlobalByLatency.X$WAIT_CLASSES_GLOBAL_BY_LATENCY;
}
