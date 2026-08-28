package com.shop.billing.scheduler.infrastructure;

import com.shop.billing.scheduler.application.CancelExpiredInvoicesApplicationService;
import org.springframework.stereotype.Service;

@Service
public class CancelExpiredInvoicesApplicationServiceJDBCImpl implements CancelExpiredInvoicesApplicationService {
    @Override
    public void cancelExpiredInvoices() {

    }
}