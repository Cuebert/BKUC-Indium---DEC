.class final Lcom/android/billingclient/api/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ly1/f;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {p1}, La2/t;->f(Landroid/content/Context;)V

    .line 2
    invoke-static {}, La2/t;->c()La2/t;

    move-result-object p1

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    .line 3
    invoke-virtual {p1, v0}, La2/t;->g(La2/f;)Ly1/g;

    move-result-object p1

    const-string v0, "PLAY_BILLING_LIBRARY"

    const-class v1, Lcom/google/android/gms/internal/play_billing/z4;

    const-string v2, "proto"

    .line 4
    invoke-static {v2}, Ly1/b;->b(Ljava/lang/String;)Ly1/b;

    move-result-object v2

    sget-object v3, Ln1/y;->a:Ln1/y;

    .line 5
    invoke-interface {p1, v0, v1, v2, v3}, Ly1/g;->a(Ljava/lang/String;Ljava/lang/Class;Ly1/b;Ly1/e;)Ly1/f;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/q;->b:Ly1/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/android/billingclient/api/q;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/z4;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/billingclient/api/q;->a:Z

    const-string v1, "BillingLogger"

    if-eqz v0, :cond_0

    const-string p1, "Skipping logging since initialization failed."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/q;->b:Ly1/f;

    .line 2
    invoke-static {p1}, Ly1/c;->d(Ljava/lang/Object;)Ly1/c;

    move-result-object p1

    invoke-interface {v0, p1}, Ly1/f;->a(Ly1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "logging failed."

    .line 3
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/b0;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
