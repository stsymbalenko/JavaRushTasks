/** @file
  Simple Text In protocol from the UEFI 2.0 specification.

  Abstraction of a very simple input device like a keyboard or serial
  terminal.

  Copyright (c) 2006 - 2008, Intel Corporation
  All rights reserved. This program and the accompanying materials
  are licensed and made available under the terms and conditions of the BSD License
  which accompanies this distribution.  The full text of the license may be found at
  http://opensource.org/licenses/bsd-license.php

  THE PROGRAM IS DISTRIBUTED UNDER THE BSD LICENSE ON AN "AS IS" BASIS,
  WITHOUT WARRANTIES OR REPRESENTATIONS OF ANY KIND, EITHER EXPRESS OR IMPLIED.

**/

#ifndef __SIMPLE_TEXT_IN_PROTOCOL_H__
#define __SIMPLE_TEXT_IN_PROTOCOL_H__

#include <gpxe/efi/ProcessorBind.h>

#define EFI_SIMPLE_TEXT_INPUT_PROTOCOL_GUID \
  { \
    0x387477c1, 0x69c7, 0x11d2, {0x8e, 0x39, 0x0, 0