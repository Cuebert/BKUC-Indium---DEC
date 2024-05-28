.class public final synthetic Lcom/android/billingclient/api/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/android/billingclient/api/d;

.field public final synthetic o:Ln1/b;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/d;Ln1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/h0;->n:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/h0;->o:Ln1/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/h0;->n:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/h0;->o:Ln1/b;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/d;->r(Ln1/b;)V

    return-void
.end method
