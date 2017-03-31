
-- #df:assertListExists@ut#
select * from MEMBER_STATUS where MEMBER_STATUS_CODE in ('SEA', 'LAN');
-- #df:assertListExists@ut#
select * from PRODUCT_STATUS where PRODUCT_STATUS_CODE in ('MYS', 'ONE', 'BBB');

-- delete records registered by TSV
delete from MEMBER_STATUS where MEMBER_STATUS_CODE in ('SEA', 'LAN');
delete from PRODUCT_STATUS where PRODUCT_STATUS_CODE in ('MYS', 'ONE', 'BBB');
