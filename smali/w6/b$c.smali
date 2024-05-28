.class final enum Lw6/b$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw6/b$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lw6/b$c;

.field public static final enum o:Lw6/b$c;

.field private static final synthetic p:[Lw6/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lw6/b$c;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw6/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw6/b$c;->n:Lw6/b$c;

    new-instance v1, Lw6/b$c;

    const-string v3, "PROCESSING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lw6/b$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lw6/b$c;->o:Lw6/b$c;

    const/4 v3, 0x2

    new-array v3, v3, [Lw6/b$c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lw6/b$c;->p:[Lw6/b$c;

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

.method public static valueOf(Ljava/lang/String;)Lw6/b$c;
    .locals 1

    const-class v0, Lw6/b$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw6/b$c;

    return-object p0
.end method

.method public static values()[Lw6/b$c;
    .locals 1

    sget-object v0, Lw6/b$c;->p:[Lw6/b$c;

    invoke-virtual {v0}, [Lw6/b$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw6/b$c;

    return-object v0
.end method
