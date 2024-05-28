.class final Lcom/android/billingclient/api/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ln1/h;

.field final synthetic c:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;Ljava/lang/String;Ln1/h;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/n0;->c:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/n0;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/android/billingclient/api/n0;->b:Ln1/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/n0;->c:Lcom/android/billingclient/api/d;

    iget-object v1, p0, Lcom/android/billingclient/api/n0;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->L(Lcom/android/billingclient/api/d;Ljava/lang/String;)Lcom/android/billingclient/api/m;

    move-result-object v0

    iget-object v1, p0, Lcom/android/billingclient/api/n0;->b:Ln1/h;

    invoke-virtual {v0}, Lcom/android/billingclient/api/m;->a()Lcom/android/billingclient/api/f;

    move-result-object v2

    invoke-virtual {v0}, Lcom/android/billingclient/api/m;->b()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v1, v2, v0}, Ln1/h;->a(Lcom/android/billingclient/api/f;Ljava/util/List;)V

    const/4 v0, 0x0

    return-object v0
.end method
