.class public Lx7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx7/a$b;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lx7/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx7/a;-><init>()V

    return-void
.end method

.method public static a()Lx7/a;
    .locals 1

    sget-object v0, Lx7/a$b;->a:Lx7/a;

    return-object v0
.end method


# virtual methods
.method public onSignalRConnectivityChangeEvent(La7/l;)V
    .locals 0
    .annotation runtime Lbc/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method
