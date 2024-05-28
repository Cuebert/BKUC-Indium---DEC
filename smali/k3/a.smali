.class public Lk3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lx2/a$g;

.field public static final b:Lx2/a;

.field public static final c:Lt3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lx2/a$g;

    invoke-direct {v0}, Lx2/a$g;-><init>()V

    sput-object v0, Lk3/a;->a:Lx2/a$g;

    .line 2
    new-instance v1, Lx2/a;

    new-instance v2, Lt3/c;

    invoke-direct {v2}, Lt3/c;-><init>()V

    const-string v3, "Fido.U2F_ZERO_PARTY_API"

    invoke-direct {v1, v3, v2, v0}, Lx2/a;-><init>(Ljava/lang/String;Lx2/a$a;Lx2/a$g;)V

    sput-object v1, Lk3/a;->b:Lx2/a;

    new-instance v0, Lt3/b;

    invoke-direct {v0}, Lt3/b;-><init>()V

    sput-object v0, Lk3/a;->c:Lt3/b;

    return-void
.end method

.method public static a(Landroid/app/Activity;)Ll3/a;
    .locals 1

    new-instance v0, Ll3/a;

    invoke-direct {v0, p0}, Ll3/a;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
