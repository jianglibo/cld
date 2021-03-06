/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables.records;


import com.mymock.db.information_schema.tables.InnodbBufferPoolStats;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class InnodbBufferPoolStatsRecord extends TableRecordImpl<InnodbBufferPoolStatsRecord> {

	private static final long serialVersionUID = -63332455;

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
	 */
	public void setPoolId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_ID</code>.
	 */
	public ULong getPoolId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
	 */
	public void setPoolSize(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.POOL_SIZE</code>.
	 */
	public ULong getPoolSize() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
	 */
	public void setFreeBuffers(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.FREE_BUFFERS</code>.
	 */
	public ULong getFreeBuffers() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
	 */
	public void setDatabasePages(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.DATABASE_PAGES</code>.
	 */
	public ULong getDatabasePages() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
	 */
	public void setOldDatabasePages(ULong value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.OLD_DATABASE_PAGES</code>.
	 */
	public ULong getOldDatabasePages() {
		return (ULong) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
	 */
	public void setModifiedDatabasePages(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.MODIFIED_DATABASE_PAGES</code>.
	 */
	public ULong getModifiedDatabasePages() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
	 */
	public void setPendingDecompress(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_DECOMPRESS</code>.
	 */
	public ULong getPendingDecompress() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
	 */
	public void setPendingReads(ULong value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_READS</code>.
	 */
	public ULong getPendingReads() {
		return (ULong) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
	 */
	public void setPendingFlushLru(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LRU</code>.
	 */
	public ULong getPendingFlushLru() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
	 */
	public void setPendingFlushList(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PENDING_FLUSH_LIST</code>.
	 */
	public ULong getPendingFlushList() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
	 */
	public void setPagesMadeYoung(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG</code>.
	 */
	public ULong getPagesMadeYoung() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
	 */
	public void setPagesNotMadeYoung(ULong value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_NOT_MADE_YOUNG</code>.
	 */
	public ULong getPagesNotMadeYoung() {
		return (ULong) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
	 */
	public void setPagesMadeYoungRate(Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_YOUNG_RATE</code>.
	 */
	public Double getPagesMadeYoungRate() {
		return (Double) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
	 */
	public void setPagesMadeNotYoungRate(Double value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_MADE_NOT_YOUNG_RATE</code>.
	 */
	public Double getPagesMadeNotYoungRate() {
		return (Double) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
	 */
	public void setNumberPagesRead(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ</code>.
	 */
	public ULong getNumberPagesRead() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
	 */
	public void setNumberPagesCreated(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_CREATED</code>.
	 */
	public ULong getNumberPagesCreated() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
	 */
	public void setNumberPagesWritten(ULong value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_WRITTEN</code>.
	 */
	public ULong getNumberPagesWritten() {
		return (ULong) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
	 */
	public void setPagesReadRate(Double value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_READ_RATE</code>.
	 */
	public Double getPagesReadRate() {
		return (Double) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
	 */
	public void setPagesCreateRate(Double value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_CREATE_RATE</code>.
	 */
	public Double getPagesCreateRate() {
		return (Double) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
	 */
	public void setPagesWrittenRate(Double value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.PAGES_WRITTEN_RATE</code>.
	 */
	public Double getPagesWrittenRate() {
		return (Double) getValue(19);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
	 */
	public void setNumberPagesGet(ULong value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_GET</code>.
	 */
	public ULong getNumberPagesGet() {
		return (ULong) getValue(20);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
	 */
	public void setHitRate(ULong value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.HIT_RATE</code>.
	 */
	public ULong getHitRate() {
		return (ULong) getValue(21);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public void setYoungMakePerThousandGets(ULong value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public ULong getYoungMakePerThousandGets() {
		return (ULong) getValue(22);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public void setNotYoungMakePerThousandGets(ULong value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NOT_YOUNG_MAKE_PER_THOUSAND_GETS</code>.
	 */
	public ULong getNotYoungMakePerThousandGets() {
		return (ULong) getValue(23);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
	 */
	public void setNumberPagesReadAhead(ULong value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_PAGES_READ_AHEAD</code>.
	 */
	public ULong getNumberPagesReadAhead() {
		return (ULong) getValue(24);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
	 */
	public void setNumberReadAheadEvicted(ULong value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.NUMBER_READ_AHEAD_EVICTED</code>.
	 */
	public ULong getNumberReadAheadEvicted() {
		return (ULong) getValue(25);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
	 */
	public void setReadAheadRate(Double value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_RATE</code>.
	 */
	public Double getReadAheadRate() {
		return (Double) getValue(26);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
	 */
	public void setReadAheadEvictedRate(Double value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.READ_AHEAD_EVICTED_RATE</code>.
	 */
	public Double getReadAheadEvictedRate() {
		return (Double) getValue(27);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
	 */
	public void setLruIoTotal(ULong value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_TOTAL</code>.
	 */
	public ULong getLruIoTotal() {
		return (ULong) getValue(28);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
	 */
	public void setLruIoCurrent(ULong value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.LRU_IO_CURRENT</code>.
	 */
	public ULong getLruIoCurrent() {
		return (ULong) getValue(29);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
	 */
	public void setUncompressTotal(ULong value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_TOTAL</code>.
	 */
	public ULong getUncompressTotal() {
		return (ULong) getValue(30);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
	 */
	public void setUncompressCurrent(ULong value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_POOL_STATS.UNCOMPRESS_CURRENT</code>.
	 */
	public ULong getUncompressCurrent() {
		return (ULong) getValue(31);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbBufferPoolStatsRecord
	 */
	public InnodbBufferPoolStatsRecord() {
		super(InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS);
	}

	/**
	 * Create a detached, initialised InnodbBufferPoolStatsRecord
	 */
	public InnodbBufferPoolStatsRecord(ULong poolId, ULong poolSize, ULong freeBuffers, ULong databasePages, ULong oldDatabasePages, ULong modifiedDatabasePages, ULong pendingDecompress, ULong pendingReads, ULong pendingFlushLru, ULong pendingFlushList, ULong pagesMadeYoung, ULong pagesNotMadeYoung, Double pagesMadeYoungRate, Double pagesMadeNotYoungRate, ULong numberPagesRead, ULong numberPagesCreated, ULong numberPagesWritten, Double pagesReadRate, Double pagesCreateRate, Double pagesWrittenRate, ULong numberPagesGet, ULong hitRate, ULong youngMakePerThousandGets, ULong notYoungMakePerThousandGets, ULong numberPagesReadAhead, ULong numberReadAheadEvicted, Double readAheadRate, Double readAheadEvictedRate, ULong lruIoTotal, ULong lruIoCurrent, ULong uncompressTotal, ULong uncompressCurrent) {
		super(InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS);

		setValue(0, poolId);
		setValue(1, poolSize);
		setValue(2, freeBuffers);
		setValue(3, databasePages);
		setValue(4, oldDatabasePages);
		setValue(5, modifiedDatabasePages);
		setValue(6, pendingDecompress);
		setValue(7, pendingReads);
		setValue(8, pendingFlushLru);
		setValue(9, pendingFlushList);
		setValue(10, pagesMadeYoung);
		setValue(11, pagesNotMadeYoung);
		setValue(12, pagesMadeYoungRate);
		setValue(13, pagesMadeNotYoungRate);
		setValue(14, numberPagesRead);
		setValue(15, numberPagesCreated);
		setValue(16, numberPagesWritten);
		setValue(17, pagesReadRate);
		setValue(18, pagesCreateRate);
		setValue(19, pagesWrittenRate);
		setValue(20, numberPagesGet);
		setValue(21, hitRate);
		setValue(22, youngMakePerThousandGets);
		setValue(23, notYoungMakePerThousandGets);
		setValue(24, numberPagesReadAhead);
		setValue(25, numberReadAheadEvicted);
		setValue(26, readAheadRate);
		setValue(27, readAheadEvictedRate);
		setValue(28, lruIoTotal);
		setValue(29, lruIoCurrent);
		setValue(30, uncompressTotal);
		setValue(31, uncompressCurrent);
	}
}
