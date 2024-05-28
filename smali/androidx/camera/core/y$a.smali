.class final enum Landroidx/camera/core/y$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/y$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Landroidx/camera/core/y$a;

.field public static final enum o:Landroidx/camera/core/y$a;

.field public static final enum p:Landroidx/camera/core/y$a;

.field public static final enum q:Landroidx/camera/core/y$a;

.field public static final enum r:Landroidx/camera/core/y$a;

.field private static final synthetic s:[Landroidx/camera/core/y$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Landroidx/camera/core/y$a;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/y$a;->n:Landroidx/camera/core/y$a;

    .line 2
    new-instance v1, Landroidx/camera/core/y$a;

    const-string v3, "INITIALIZING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Landroidx/camera/core/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Landroidx/camera/core/y$a;->o:Landroidx/camera/core/y$a;

    .line 3
    new-instance v3, Landroidx/camera/core/y$a;

    const-string v5, "INITIALIZING_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Landroidx/camera/core/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Landroidx/camera/core/y$a;->p:Landroidx/camera/core/y$a;

    .line 4
    new-instance v5, Landroidx/camera/core/y$a;

    const-string v7, "INITIALIZED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Landroidx/camera/core/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Landroidx/camera/core/y$a;->q:Landroidx/camera/core/y$a;

    .line 5
    new-instance v7, Landroidx/camera/core/y$a;

    const-string v9, "SHUTDOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Landroidx/camera/core/y$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Landroidx/camera/core/y$a;->r:Landroidx/camera/core/y$a;

    const/4 v9, 0x5

    new-array v9, v9, [Landroidx/camera/core/y$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Landroidx/camera/core/y$a;->s:[Landroidx/camera/core/y$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/y$a;
    .locals 1

    const-class v0, Landroidx/camera/core/y$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/y$a;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/y$a;
    .locals 1

    sget-object v0, Landroidx/camera/core/y$a;->s:[Landroidx/camera/core/y$a;

    invoke-virtual {v0}, [Landroidx/camera/core/y$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/y$a;

    return-object v0
.end method
