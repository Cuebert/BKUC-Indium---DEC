.class final enum Lg6/u;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg6/u;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum n:Lg6/u;

.field private static final synthetic o:[Lg6/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg6/u;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg6/u;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg6/u;->n:Lg6/u;

    const/4 v1, 0x1

    new-array v1, v1, [Lg6/u;

    aput-object v0, v1, v2

    sput-object v1, Lg6/u;->o:[Lg6/u;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-string p1, "INSTANCE"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lg6/u;
    .locals 1

    sget-object v0, Lg6/u;->o:[Lg6/u;

    invoke-virtual {v0}, [Lg6/u;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg6/u;

    return-object v0
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lg6/g;->a()Lg6/g;

    move-result-object v0

    invoke-static {v0}, Lg6/g;->e(Lg6/g;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
