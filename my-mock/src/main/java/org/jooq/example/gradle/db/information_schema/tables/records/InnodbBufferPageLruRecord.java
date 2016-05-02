/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.example.gradle.db.information_schema.tables.InnodbBufferPageLru;
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
public class InnodbBufferPageLruRecord extends TableRecordImpl<InnodbBufferPageLruRecord> implements Record20<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong> {

	private static final long serialVersionUID = -387982348;

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public void setPoolId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.POOL_ID</code>.
	 */
	public ULong getPoolId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public void setLruPosition(ULong value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.LRU_POSITION</code>.
	 */
	public ULong getLruPosition() {
		return (ULong) getValue(1);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public void setSpace(ULong value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.SPACE</code>.
	 */
	public ULong getSpace() {
		return (ULong) getValue(2);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public void setPageNumber(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER</code>.
	 */
	public ULong getPageNumber() {
		return (ULong) getValue(3);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public void setPageType(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE</code>.
	 */
	public String getPageType() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public void setFlushType(ULong value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE</code>.
	 */
	public ULong getFlushType() {
		return (ULong) getValue(5);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public void setFixCount(ULong value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FIX_COUNT</code>.
	 */
	public ULong getFixCount() {
		return (ULong) getValue(6);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public void setIsHashed(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_HASHED</code>.
	 */
	public String getIsHashed() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public void setNewestModification(ULong value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION</code>.
	 */
	public ULong getNewestModification() {
		return (ULong) getValue(8);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public void setOldestModification(ULong value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION</code>.
	 */
	public ULong getOldestModification() {
		return (ULong) getValue(9);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public void setAccessTime(ULong value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME</code>.
	 */
	public ULong getAccessTime() {
		return (ULong) getValue(10);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public void setTableName(String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.TABLE_NAME</code>.
	 */
	public String getTableName() {
		return (String) getValue(11);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public void setIndexName(String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.INDEX_NAME</code>.
	 */
	public String getIndexName() {
		return (String) getValue(12);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public void setNumberRecords(ULong value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS</code>.
	 */
	public ULong getNumberRecords() {
		return (ULong) getValue(13);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public void setDataSize(ULong value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.DATA_SIZE</code>.
	 */
	public ULong getDataSize() {
		return (ULong) getValue(14);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public void setCompressedSize(ULong value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE</code>.
	 */
	public ULong getCompressedSize() {
		return (ULong) getValue(15);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public void setCompressed(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.COMPRESSED</code>.
	 */
	public String getCompressed() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public void setIoFix(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IO_FIX</code>.
	 */
	public String getIoFix() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public void setIsOld(String value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.IS_OLD</code>.
	 */
	public String getIsOld() {
		return (String) getValue(18);
	}

	/**
	 * Setter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public void setFreePageClock(ULong value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>information_schema.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK</code>.
	 */
	public ULong getFreePageClock() {
		return (ULong) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong> fieldsRow() {
		return (Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong> valuesRow() {
		return (Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.POOL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field2() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.LRU_POSITION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field3() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.SPACE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.PAGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field6() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FLUSH_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field7() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FIX_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_HASHED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field9() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NEWEST_MODIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field10() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.OLDEST_MODIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field11() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.ACCESS_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field12() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.TABLE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field13() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.INDEX_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field14() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.NUMBER_RECORDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field15() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.DATA_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field16() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.COMPRESSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IO_FIX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field19() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.IS_OLD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field20() {
		return InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU.FREE_PAGE_CLOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getPoolId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value2() {
		return getLruPosition();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value3() {
		return getSpace();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getPageNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPageType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value6() {
		return getFlushType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value7() {
		return getFixCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getIsHashed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value9() {
		return getNewestModification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value10() {
		return getOldestModification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value11() {
		return getAccessTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value12() {
		return getTableName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value13() {
		return getIndexName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value14() {
		return getNumberRecords();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value15() {
		return getDataSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value16() {
		return getCompressedSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getCompressed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getIoFix();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value19() {
		return getIsOld();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value20() {
		return getFreePageClock();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value1(ULong value) {
		setPoolId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value2(ULong value) {
		setLruPosition(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value3(ULong value) {
		setSpace(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value4(ULong value) {
		setPageNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value5(String value) {
		setPageType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value6(ULong value) {
		setFlushType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value7(ULong value) {
		setFixCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value8(String value) {
		setIsHashed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value9(ULong value) {
		setNewestModification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value10(ULong value) {
		setOldestModification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value11(ULong value) {
		setAccessTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value12(String value) {
		setTableName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value13(String value) {
		setIndexName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value14(ULong value) {
		setNumberRecords(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value15(ULong value) {
		setDataSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value16(ULong value) {
		setCompressedSize(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value17(String value) {
		setCompressed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value18(String value) {
		setIoFix(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value19(String value) {
		setIsOld(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord value20(ULong value) {
		setFreePageClock(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InnodbBufferPageLruRecord values(ULong value1, ULong value2, ULong value3, ULong value4, String value5, ULong value6, ULong value7, String value8, ULong value9, ULong value10, ULong value11, String value12, String value13, ULong value14, ULong value15, ULong value16, String value17, String value18, String value19, ULong value20) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InnodbBufferPageLruRecord
	 */
	public InnodbBufferPageLruRecord() {
		super(InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);
	}

	/**
	 * Create a detached, initialised InnodbBufferPageLruRecord
	 */
	public InnodbBufferPageLruRecord(ULong poolId, ULong lruPosition, ULong space, ULong pageNumber, String pageType, ULong flushType, ULong fixCount, String isHashed, ULong newestModification, ULong oldestModification, ULong accessTime, String tableName, String indexName, ULong numberRecords, ULong dataSize, ULong compressedSize, String compressed, String ioFix, String isOld, ULong freePageClock) {
		super(InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU);

		setValue(0, poolId);
		setValue(1, lruPosition);
		setValue(2, space);
		setValue(3, pageNumber);
		setValue(4, pageType);
		setValue(5, flushType);
		setValue(6, fixCount);
		setValue(7, isHashed);
		setValue(8, newestModification);
		setValue(9, oldestModification);
		setValue(10, accessTime);
		setValue(11, tableName);
		setValue(12, indexName);
		setValue(13, numberRecords);
		setValue(14, dataSize);
		setValue(15, compressedSize);
		setValue(16, compressed);
		setValue(17, ioFix);
		setValue(18, isOld);
		setValue(19, freePageClock);
	}
}