/** @file
  EFI Guid Partition Table Format Definition.

  Copyright (c) 2006 - 2008, Intel Corporation
  All rights reserved. This program and the accompanying materials
  are licensed and made available under the terms and conditions of the BSD License
  which accompanies this distribution.  The full text of the license may be found at
  http://opensource.org/licenses/bsd-license.php

  THE PROGRAM IS DISTRIBUTED UNDER THE BSD LICENSE ON AN "AS IS" BASIS,
  WITHOUT WARRANTIES OR REPRESENTATIONS OF ANY KIND, EITHER EXPRESS OR IMPLIED.

**/

#ifndef __UEFI_GPT_H__
#define __UEFI_GPT_H__

///
/// The primary GUID Partition Table Header must be
/// located in LBA 1 (i.e., the second logical block).
///
#define PRIMARY_PART_HEADER_LBA 1

///
/// EFI Partition Table Signature: "EFI PART"
///
#define EFI_PTAB_HEADER_ID      0x5452415020494645ULL

#pragma pack(1)

///
/// GPT Partition T