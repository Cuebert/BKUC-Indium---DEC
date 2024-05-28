.class public final enum Lx7/b$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx7/b$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lx7/b$f;

.field public static final enum o:Lx7/b$f;

.field public static final enum p:Lx7/b$f;

.field public static final enum q:Lx7/b$f;

.field public static final enum r:Lx7/b$f;

.field private static final synthetic s:[Lx7/b$f;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lx7/b$f;

    const-string v1, "LOGOUT_BY_USER_IN_NATIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx7/b$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx7/b$f;->n:Lx7/b$f;

    .line 2
    new-instance v1, Lx7/b$f;

    const-string v3, "LOGOUT_BY_USER_IN_LUA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lx7/b$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx7/b$f;->o:Lx7/b$f;

    .line 3
    new-instance v3, Lx7/b$f;

    const-string v5, "LOGOUT_BY_401_ERROR_IN_NATIVE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lx7/b$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lx7/b$f;->p:Lx7/b$f;

    .line 4
    new-instance v5, Lx7/b$f;

    const-string v7, "LOGOUT_BY_401_ERROR_IN_WEB"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lx7/b$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lx7/b$f;->q:Lx7/b$f;

    .line 5
    new-instance v7, Lx7/b$f;

    const-string v9, "LOGOUT_BY_401_ERROR_IN_LUA"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lx7/b$f;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lx7/b$f;->r:Lx7/b$f;

    const/4 v9, 0x5

    new-array v9, v9, [Lx7/b$f;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lx7/b$f;->s:[Lx7/b$f;

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

.method public static valueOf(Ljava/lang/String;)Lx7/b$f;
    .locals 1

    const-class v0, Lx7/b$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx7/b$f;

    return-object p0
.end method

.method public static values()[Lx7/b$f;
    .locals 1

    sget-object v0, Lx7/b$f;->s:[Lx7/b$f;

    invoke-virtual {v0}, [Lx7/b$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx7/b$f;

    return-object v0
.end method
