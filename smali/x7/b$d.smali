.class public final enum Lx7/b$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx7/b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lx7/b$d;

.field public static final enum o:Lx7/b$d;

.field public static final enum p:Lx7/b$d;

.field private static final synthetic q:[Lx7/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lx7/b$d;

    const-string v1, "APP_INIT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx7/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx7/b$d;->n:Lx7/b$d;

    .line 2
    new-instance v1, Lx7/b$d;

    const-string v3, "APP_INIT_TYPE_SHELL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lx7/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx7/b$d;->o:Lx7/b$d;

    .line 3
    new-instance v3, Lx7/b$d;

    const-string v5, "APP_INIT_TYPE_GAME"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lx7/b$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lx7/b$d;->p:Lx7/b$d;

    const/4 v5, 0x3

    new-array v5, v5, [Lx7/b$d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    .line 4
    sput-object v5, Lx7/b$d;->q:[Lx7/b$d;

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

.method public static valueOf(Ljava/lang/String;)Lx7/b$d;
    .locals 1

    const-class v0, Lx7/b$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx7/b$d;

    return-object p0
.end method

.method public static values()[Lx7/b$d;
    .locals 1

    sget-object v0, Lx7/b$d;->q:[Lx7/b$d;

    invoke-virtual {v0}, [Lx7/b$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx7/b$d;

    return-object v0
.end method
