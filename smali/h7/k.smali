.class public Lh7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lh7/k;


# instance fields
.field private a:Lob/d0;

.field private b:I

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lh7/k;->b:I

    .line 3
    iput v0, p0, Lh7/k;->c:I

    return-void
.end method

.method public static a()Lh7/k;
    .locals 2

    .line 1
    sget-object v0, Lh7/k;->d:Lh7/k;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lh7/k;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lh7/k;->d:Lh7/k;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lh7/k;

    invoke-direct {v1}, Lh7/k;-><init>()V

    sput-object v1, Lh7/k;->d:Lh7/k;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lh7/k;->d:Lh7/k;

    return-object v0
.end method


# virtual methods
.method public b()Lob/d0;
    .locals 5

    .line 1
    iget-object v0, p0, Lh7/k;->a:Lob/d0;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lo9/c;

    const/4 v1, 0x0

    iget v2, p0, Lh7/k;->b:I

    iget v3, p0, Lh7/k;->c:I

    invoke-static {}, Ln9/g;->e()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lo9/c;-><init>(Lob/p;IILjava/lang/String;)V

    invoke-virtual {v0}, Lo9/c;->a()Lob/d0;

    move-result-object v0

    iput-object v0, p0, Lh7/k;->a:Lob/d0;

    .line 3
    :cond_0
    iget-object v0, p0, Lh7/k;->a:Lob/d0;

    return-object v0
.end method
