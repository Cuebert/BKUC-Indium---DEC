.class public final Ln1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/e$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ln1/e$a;
    .locals 2

    new-instance v0, Ln1/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/e$a;-><init>(Ln1/w;)V

    return-object v0
.end method

.method static bridge synthetic c(Ln1/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ln1/e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln1/e;->a:Ljava/lang/String;

    return-object v0
.end method
