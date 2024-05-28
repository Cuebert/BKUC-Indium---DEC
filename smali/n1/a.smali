.class public final Ln1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/a$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ln1/a$a;
    .locals 2

    new-instance v0, Ln1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/a$a;-><init>(Ln1/m;)V

    return-object v0
.end method

.method static bridge synthetic c(Ln1/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ln1/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln1/a;->a:Ljava/lang/String;

    return-object v0
.end method
