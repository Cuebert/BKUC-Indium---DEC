.class public final synthetic Lcom/android/billingclient/api/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/android/billingclient/api/d;

.field public final synthetic o:Ln1/f;

.field public final synthetic p:Ln1/e;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/d;Ln1/f;Ln1/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/e0;->n:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/e0;->o:Ln1/f;

    iput-object p3, p0, Lcom/android/billingclient/api/e0;->p:Ln1/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/e0;->n:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/e0;->o:Ln1/f;

    iget-object v2, p0, Lcom/android/billingclient/api/e0;->p:Ln1/e;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/d;->t(Ln1/f;Ln1/e;)V

    return-void
.end method
