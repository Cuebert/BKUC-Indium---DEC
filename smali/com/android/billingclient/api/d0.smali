.class public final synthetic Lcom/android/billingclient/api/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/android/billingclient/api/d;

.field public final synthetic b:Ln1/e;

.field public final synthetic c:Ln1/f;


# direct methods
.method public synthetic constructor <init>(Lcom/android/billingclient/api/d;Ln1/e;Ln1/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/d0;->a:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/d0;->b:Ln1/e;

    iput-object p3, p0, Lcom/android/billingclient/api/d0;->c:Ln1/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/d0;->a:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/d0;->b:Ln1/e;

    iget-object v2, p0, Lcom/android/billingclient/api/d0;->c:Ln1/f;

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/d;->Q(Ln1/e;Ln1/f;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
