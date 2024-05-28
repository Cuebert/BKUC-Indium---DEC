.class public Lkotlin/jvm/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/q;

.field private static final b:[Lhb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    .line 1
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/q;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/q;

    invoke-direct {v0}, Lkotlin/jvm/internal/q;-><init>()V

    :goto_1
    sput-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    const/4 v0, 0x0

    new-array v0, v0, [Lhb/c;

    .line 4
    sput-object v0, Lkotlin/jvm/internal/p;->b:[Lhb/c;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/g;)Lhb/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/q;->a(Lkotlin/jvm/internal/g;)Lhb/e;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lhb/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Class;)Lhb/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lhb/d;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/q;->c(Ljava/lang/Class;Ljava/lang/String;)Lhb/d;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/l;)Lhb/f;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/q;->d(Lkotlin/jvm/internal/l;)Lhb/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/j;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/p;->a:Lkotlin/jvm/internal/q;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/q;->f(Lkotlin/jvm/internal/j;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
