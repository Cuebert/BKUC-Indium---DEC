.class public Lo9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo9/a;


# static fields
.field private static final b:Ljava/lang/Object;


# instance fields
.field private a:Lo9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo9/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lo9/i;
    .locals 3

    .line 1
    sget-object v0, Lo9/b;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lo9/b;->a:Lo9/i;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Lo9/i;

    sget-object v2, Ljava/net/CookiePolicy;->ACCEPT_ALL:Ljava/net/CookiePolicy;

    invoke-direct {v1, v2}, Lo9/i;-><init>(Ljava/net/CookiePolicy;)V

    iput-object v1, p0, Lo9/b;->a:Lo9/i;

    .line 4
    :cond_0
    iget-object v1, p0, Lo9/b;->a:Lo9/i;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
