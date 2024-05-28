.class final synthetic Lcom/google/firebase/iid/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field static final a:Lj5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/iid/b;

    invoke-direct {v0}, Lcom/google/firebase/iid/b;-><init>()V

    sput-object v0, Lcom/google/firebase/iid/b;->a:Lj5/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Lh5/c;

    .line 2
    invoke-interface {p1, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh5/c;

    const-class v2, Lp5/d;

    .line 3
    invoke-interface {p1, v2}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp5/d;

    const-class v3, La6/i;

    .line 4
    invoke-interface {p1, v3}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/i;

    invoke-direct {v0, v1, v2, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Lh5/c;Lp5/d;La6/i;)V

    return-object v0
.end method
