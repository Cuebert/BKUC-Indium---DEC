.class public final enum Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

.field public static final enum o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

.field private static final synthetic p:[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    const-string v1, "ASC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->n:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    .line 2
    new-instance v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    const-string v3, "DESC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->o:Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    .line 3
    sput-object v3, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->p:[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

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

.method public static valueOf(Ljava/lang/String;)Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;
    .locals 1

    const-class v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    return-object p0
.end method

.method public static values()[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;
    .locals 1

    sget-object v0, Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->p:[Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    invoke-virtual {v0}, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/birbit/android/jobqueue/persistentQueue/sqlite/b$b$a;

    return-object v0
.end method
