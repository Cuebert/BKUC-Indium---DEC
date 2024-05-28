.class public abstract La2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lo5/h;->a()Lo5/h$a;

    move-result-object v0

    sget-object v1, La2/a;->a:Lm5/a;

    invoke-virtual {v0, v1}, Lo5/h$a;->d(Lm5/a;)Lo5/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lo5/h$a;->c()Lo5/h;

    move-result-object v0

    sput-object v0, La2/l;->a:Lo5/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    sget-object v0, La2/l;->a:Lo5/h;

    invoke-virtual {v0, p0}, Lo5/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Ld2/a;
.end method
