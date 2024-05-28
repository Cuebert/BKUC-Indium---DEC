.class final enum Lx7/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx7/b$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lx7/b$c;

.field public static final enum o:Lx7/b$c;

.field public static final enum p:Lx7/b$c;

.field public static final enum q:Lx7/b$c;

.field private static final synthetic r:[Lx7/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lx7/b$c;

    const-string v1, "APP_INIT_STATUS_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lx7/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lx7/b$c;->n:Lx7/b$c;

    .line 2
    new-instance v1, Lx7/b$c;

    const-string v3, "APP_INIT_STATUS_STARTED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lx7/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lx7/b$c;->o:Lx7/b$c;

    .line 3
    new-instance v3, Lx7/b$c;

    const-string v5, "APP_INIT_STATUS_OK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lx7/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lx7/b$c;->p:Lx7/b$c;

    .line 4
    new-instance v5, Lx7/b$c;

    const-string v7, "APP_INIT_STATUS_ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lx7/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lx7/b$c;->q:Lx7/b$c;

    const/4 v7, 0x4

    new-array v7, v7, [Lx7/b$c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    .line 5
    sput-object v7, Lx7/b$c;->r:[Lx7/b$c;

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

.method public static valueOf(Ljava/lang/String;)Lx7/b$c;
    .locals 1

    const-class v0, Lx7/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx7/b$c;

    return-object p0
.end method

.method public static values()[Lx7/b$c;
    .locals 1

    sget-object v0, Lx7/b$c;->r:[Lx7/b$c;

    invoke-virtual {v0}, [Lx7/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx7/b$c;

    return-object v0
.end method
